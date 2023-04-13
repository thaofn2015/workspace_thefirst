package fan.study.patterns.structuaral.bridge;

public class VTBank extends Bank {

	public VTBank(BankActivites bankActivites) {
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
