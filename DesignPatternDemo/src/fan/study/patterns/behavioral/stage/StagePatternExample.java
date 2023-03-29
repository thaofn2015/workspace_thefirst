package fan.study.patterns.behavioral.stage;

/*
 * https://gpcoder.com/4785-huong-dan-java-design-pattern-state/
 */
public class StagePatternExample {

	public static void main(String[] args) {
		Document doc = new Document();
		doc.setDocumentName("Document 1");
		
		doc.setDocumentStage(new NewStage());
		doc.applyState();
		
		doc.setDocumentStage(new SubmittedStage());
		doc.applyState();
		
		doc.setDocumentStage(new ApprovedStage());
		doc.applyState();
		
		doc.setDocumentStage(new RejectStage());
		doc.applyState();

	}
}
