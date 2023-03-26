package fan.study.patterns.behavioral.observer;

public class Logger implements Observer {

	@Override
	public void update(User user) {
		if (!"".equals(user.getIp())) {
			System.out.println("User " + user.toString() + " dang login voi ip: "  + user.getIp());
		}
	}
}
