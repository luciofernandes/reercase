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

import org.apache.commons.codec.binary.Base64;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.ide.IDE;
import org.jboss.resteasy.client.ClientRequest;
import org.jboss.resteasy.client.ClientResponse;

import rmm.diagram.part.RmmDiagramEditor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;


public class TransformationAction implements IWorkbenchWindowActionDelegate {

	private String ENCONDED_B64 = "eer file encoded to base64";
	private String SCHEMA_NAME = "Name of EER Schema";
	private String GENERETED_SQL = "Operation failed";
	private String SERVER_LINK = "http://localhost:8080/transformationserver/transformation/execute";
	//private String SERVER_LINK = "http://150.161.2.78:8080/transformationserver/transformation/execute";
	
	@Override
	public void run(IAction action) {
		// Get the active editor
		IEditorPart editor = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		// This is only meaningful if the editor is a Friends diagram editor
		if (editor instanceof RmmDiagramEditor) {
			RmmDiagramEditor eerDiagramEditor = (RmmDiagramEditor) editor;
			ResourceSet eerResourceSet = eerDiagramEditor.getEditingDomain().getResourceSet();

			// Get the EMF model under the editor
			Resource resource = getFirstSemanticModelResource(eerResourceSet);

			if (resource == null) return;

			// Get file location
			String fileLocation = ResourcesPlugin.getWorkspace().getRoot().getLocation().toString();
			fileLocation = fileLocation + resource.getURI().path();
			fileLocation = fileLocation.replace("/", "\\").replace("\\resource", "");

			// Load file
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
			schemaName = schemaName.replaceAll(".rmm", "");			
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
	}

	public Resource getFirstSemanticModelResource(ResourceSet resourceSet) {
		for (Resource resource : resourceSet.getResources()) {
			return resource;
		}
		return null;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
	}

	@Override
	public void dispose() {
	}

	@Override
	public void init(IWorkbenchWindow window) {
	}
}
