package fan.study.patterns.behavioral.stage;

public class Document {

	private String documentName;

	private DocumentState documentStage;

	public String getDocumentName() {
		return documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public DocumentState getDocumentStage() {
		return documentStage;
	}

	public void setDocumentStage(DocumentState documentStage) {
		this.documentStage = documentStage;
	}

	public void applyState() {
		documentStage.handleRequest();
	}

}
