package fan.study.patterns.structuaral.bridge;

public class BankActivitesLocal implements BankActivites {

	@Override
	public void checkingAccount() {
		System.out.println("Checking account local type");
	}

	@Override
	public void savingAccount() {
		System.out.println("Saving account local type");
	}

}
