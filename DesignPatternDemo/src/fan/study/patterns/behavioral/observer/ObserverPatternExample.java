package fan.study.patterns.behavioral.observer;

/*
 * https://gpcoder.com/4747-huong-dan-java-design-pattern-observer/
 */
public class ObserverPatternExample {

	public static void main(String[] args) {
		AccountService account1 = new AccountService("ThaoPN1", null);
		account1.attach(new Logger());
		account1.attach(new Mailer());
		account1.login("127.0.0.1");
		account1.updateMail("ThaoPN11");
	}
}
