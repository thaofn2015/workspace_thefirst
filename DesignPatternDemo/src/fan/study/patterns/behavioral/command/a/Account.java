package fan.study.patterns.behavioral.command.a;

public class Account {
	
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void openAccount() {
		System.out.println("Open account " + this.name);
	}
	
	public void closeAccount() {
		System.out.println("Close account " + this.name);
	}
}
