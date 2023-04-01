package fan.study.patterns.behavioral.command.a;

public class Main {

	public static void main(String[] args) {
		Account acc = new Account();
		acc.setName("ThaoPN1");
		
		OpenAccountCommand open = new OpenAccountCommand(acc);
		CloseAccountCommand close = new CloseAccountCommand(acc);
		
		BankApp bankApp = new BankApp(open, close);
		bankApp.open();
		bankApp.close();
	}
}
