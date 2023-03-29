package fan.study.patterns.behavioral.stage;

public class NewStage implements DocumentState {

	@Override
	public void handleRequest() {
		System.out.println("Handle for new document!");
	}

}
