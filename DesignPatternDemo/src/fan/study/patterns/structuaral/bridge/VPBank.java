package fan.study.patterns.structuaral.bridge;

public class VPBank extends Bank {

	public VPBank(BankActivites bankActivites) {
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
