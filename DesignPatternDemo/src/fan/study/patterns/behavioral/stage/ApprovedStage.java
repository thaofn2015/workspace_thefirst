package fan.study.patterns.behavioral.stage;

public class ApprovedStage implements DocumentState {

	@Override
	public void handleRequest() {
		System.out.println("Handle for approve document!");
	}

}
