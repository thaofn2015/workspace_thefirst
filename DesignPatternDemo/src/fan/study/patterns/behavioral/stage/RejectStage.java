package fan.study.patterns.behavioral.stage;

public class RejectStage implements DocumentState {

	@Override
	public void handleRequest() {
		System.out.println("Handle for reject document!");
	}

}
