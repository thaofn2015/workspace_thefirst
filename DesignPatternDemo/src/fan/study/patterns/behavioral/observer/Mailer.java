package fan.study.patterns.behavioral.observer;

public class Mailer implements Observer {

	@Override
	public void update(User user) {
		if (user.getNewMail() != null && !user.getEmail().equals(user.getNewMail())) {
			System.out.println("User " + user.toString() + " da update dia chi mail tu " + user.getEmail() +" thanh " + user.getNewMail());
		}
	}

}
