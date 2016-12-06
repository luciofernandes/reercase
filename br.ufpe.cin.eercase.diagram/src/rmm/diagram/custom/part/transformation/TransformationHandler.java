package rmm.diagram.custom.part.transformation;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

import rmm.diagram.part.RmmDiagramEditor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;



public class TransformationHandler extends AbstractHandler{

	private String ENCONDED_B64 = "eer file encoded to base64";
	private String SCHEMA_NAME = "Name of EER Schema";
	private String GENERETED_SQL = "Operation failed";
	private String SERVER_LINK = "http://localhost:8080/transformationserver/transformation/execute";
	//private String SERVER_LINK = "http://150.161.2.78:8080/transformationserver/transformation/execute";

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		// Get the active editor
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		// This is only meaningful if the editor is a Friends diagram editor
		if (editor instanceof RmmDiagramEditor) {
			RmmDiagramEditor rmmDiagramEditor = (RmmDiagramEditor) editor;
			ResourceSet eerResourceSet = rmmDiagramEditor.getEditingDomain().getResourceSet();

			// Get the EMF model under the editor
			Resource resource = getFirstSemanticModelResource(eerResourceSet);

			if (resource == null) return null;
			// Get file location
			String fileLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			fileLocation = fileLocation + resource.getURI().path();

			String OS = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);

			if ((OS.indexOf("mac") >= 0) || (OS.indexOf("darwin") >= 0)) {

			} else if (OS.indexOf("win") >= 0) {
				fileLocation = fileLocation.replace("/", "\\").replace("\\resource", "");
			} else if (OS.indexOf("nux") >= 0) {
				fileLocation = fileLocation.replace("/resource", "");
			} else {

			}

			Path path = Paths.get(fileLocation);
			byte[] data = null;
			try {
				data = Files.readAllBytes(path);
				ENCONDED_B64 = new String(Base64.encodeBase64(data));
			} catch (IOException e1) {
				e1.printStackTrace();
			}

			try {

				ClientRequest request = new ClientRequest(SERVER_LINK);
				request.accept("application/json");

				SCHEMA_NAME = resource.getURI().segment(resource.getURI().segmentCount()-1).replaceAll(".rmm", "");

				Transformation t = new Transformation(System.getProperty("user.name"), ENCONDED_B64, SCHEMA_NAME, "RMMToRelational");

				ObjectMapper mapper = new ObjectMapper();
				String input = null;
				try {
					input = mapper.writeValueAsString(t);
				} catch (JsonProcessingException e1) {
					e1.printStackTrace();
				}
				request.body("application/json", input);

				ClientResponse<String> response = request.post(String.class);

				if (response.getStatus() != 200 ) {
					throw new RuntimeException("Failed : HTTP error code : "+ response.getStatus());
				}

				BufferedReader br = new BufferedReader(new InputStreamReader(
						new ByteArrayInputStream(response.getEntity().getBytes())));

				GENERETED_SQL =  org.apache.commons.io.IOUtils.toString(br);

			} catch (MalformedURLException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

			int countSegments = resource.getURI().segmentCount();
			String projectName = resource.getURI().segment(1);
			String schemaName = resource.getURI().segment(countSegments-1);
			schemaName = schemaName.replaceAll(".eer", "");			
			String fileName = "";
			for(int countResource = 2; countResource < countSegments-1 ; countResource++){
				fileName = fileName +"/"+ resource.getURI().segment(countResource);
			}
			Date dNow = new Date();
			SimpleDateFormat ft = new SimpleDateFormat ("-dd.MM.yyyy-hh.mm.ss");

			fileName = fileName+"/"+schemaName+ft.format(dNow)+".sql";
			fileName = fileName.replaceAll("%20", "\\ ");
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			IProject myProject = myWorkspaceRoot.getProject(projectName);
			IFile newSQL = myProject.getFile(fileName);

			InputStream fileStream = new ByteArrayInputStream(GENERETED_SQL.getBytes(StandardCharsets.UTF_8));

			IProgressMonitor monitor = new NullProgressMonitor();
			monitor.beginTask("create SQL File", 1);

			if(newSQL.exists()){
				try {
					newSQL.setContents(fileStream, false, true, monitor);
					monitor.worked(1);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}else{
				try {
					newSQL.create(fileStream, false, monitor);
					monitor.worked(1);
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
			monitor.done();
			IWorkbenchPage page = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
			try {
				IDE.openEditor(page, newSQL);
			} catch (PartInitException e) {
				e.printStackTrace();
			}
		}
		return null;
	}

	public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			return resource;
		}
		return null;
	}

}
