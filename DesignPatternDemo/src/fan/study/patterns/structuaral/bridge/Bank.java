package fan.study.patterns.structuaral.bridge;

public abstract class Bank {

	protected BankActivites bankActivites;
	
	public Bank(BankActivites bankActivites) {
		this.bankActivites = bankActivites;
	}
	
	public abstract void checkingAccount();
	
	public abstract void savingAccount();
}
