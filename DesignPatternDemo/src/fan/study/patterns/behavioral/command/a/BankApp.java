package fan.study.patterns.behavioral.command.a;

public class BankApp {

	private OpenAccountCommand openAccountCommand;
	private CloseAccountCommand closeAccountCommand;

	public BankApp(OpenAccountCommand openAccountCommand, CloseAccountCommand closeAccountCommand) {
		this.openAccountCommand = openAccountCommand;
		this.closeAccountCommand = closeAccountCommand;
	}
	
	public void open() {
		openAccountCommand.execute();
	}
	
	public void close() {
		closeAccountCommand.execute();
	}

}
