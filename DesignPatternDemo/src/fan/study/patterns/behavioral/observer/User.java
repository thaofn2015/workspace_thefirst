package fan.study.patterns.behavioral.observer;

public class User {

	private String email;

	private String ip;
	
	private String newMail;

	public User(String email, String ip) {
		super();
		this.email = email;
		this.ip = ip;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNewMail() {
		return newMail;
	}

	public void setNewMail(String newMail) {
		this.newMail = newMail;
	}
}
