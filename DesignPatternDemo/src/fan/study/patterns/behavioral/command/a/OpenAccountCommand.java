package fan.study.patterns.behavioral.command.a;

public class OpenAccountCommand implements ICommand {

	private Account account;
	
	public OpenAccountCommand(Account account) {
		this.account = account;
	}

	@Override
	public void execute() {
		account.openAccount();
	}

}
