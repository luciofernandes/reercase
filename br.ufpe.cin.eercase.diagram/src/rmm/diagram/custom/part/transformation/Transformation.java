package rmm.diagram.custom.part.transformation;

public class Transformation {
	private String user;
	private String sourceData;
	private String sourceName;
	private String type;

	public Transformation(){}

	
	public Transformation(String user, String sourceData, String sourceName,
			String type) {
		super();
		this.user = user;
		this.sourceData = sourceData;
		this.sourceName = sourceName;
		this.type = type;
	}


	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getSourceData() {
		return sourceData;
	}

	public void setSourceData(String sourceData) {
		this.sourceData = sourceData;
	}

	public String getSourceName() {
		return sourceName;
	}

	public void setSourceName(String sourceName) {
		this.sourceName = sourceName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}	
}
