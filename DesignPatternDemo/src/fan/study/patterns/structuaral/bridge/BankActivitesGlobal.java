package fan.study.patterns.structuaral.bridge;

public class BankActivitesGlobal implements BankActivites {

	@Override
	public void checkingAccount() {
		System.out.println("Checking account global type");
	}

	@Override
	public void savingAccount() {
		System.out.println("Saving account global type");
	}

}
