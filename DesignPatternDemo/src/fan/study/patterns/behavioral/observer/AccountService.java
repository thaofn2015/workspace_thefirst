package fan.study.patterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AccountService implements Subject {

	private List<Observer> observers;
	
	private User user;

	@Override
	public void attach(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void notifyAllObserver() {
		observers.forEach(x -> x.update(user));
	}
	
	public AccountService(String mail, String ip) {
		observers = new ArrayList<Observer>();
		user = new User(mail, ip);
	}
	
	public void login(String ip) {
		System.out.println("------ Login -----");
		user.setIp("127.0.0.1");
		this.notifyAllObserver();
	}
	
	public void updateMail(String newMail) {
		System.out.println("------ Update mail -----");
		user.setNewMail(newMail);
		this.notifyAllObserver();
		user.setEmail(newMail);
		
	}
}
