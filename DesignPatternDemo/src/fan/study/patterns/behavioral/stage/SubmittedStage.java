package fan.study.patterns.behavioral.stage;

public class SubmittedStage implements DocumentState {

	@Override
	public void handleRequest() {
		System.out.println("Handle for submit document!");
	}

}
