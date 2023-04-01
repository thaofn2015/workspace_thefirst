package fan.study.patterns.behavioral.command.a;

public class CloseAccountCommand implements ICommand {

	private Account account;

	public CloseAccountCommand(Account account) {
		this.account = account;
	}

	@Override
	public void execute() {
		account.closeAccount();
	}

}
