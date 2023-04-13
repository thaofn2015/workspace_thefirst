package fan.study.patterns.structuaral.bridge;

public class TPBank extends Bank {

	public TPBank(BankActivites bankActivites) {
		super(bankActivites);
	}

	@Override
	public void checkingAccount() {
		this.bankActivites.checkingAccount();
	}

	@Override
	public void savingAccount() {
		this.bankActivites.savingAccount();
	}

}
