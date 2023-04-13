package fan.study.patterns.structuaral.bridge;

public class Main {

	public static void main(String[] args) {
		Bank tpBank = new TPBank(new BankActivitesGlobal());
		tpBank.checkingAccount();
		tpBank.savingAccount();
		
		Bank vpBank = new VPBank(new BankActivitesGlobal());
		vpBank.checkingAccount();
		vpBank.savingAccount();
		
		Bank vtBank = new VTBank(new BankActivitesLocal());
		vtBank.checkingAccount();
		vtBank.savingAccount();
	}
}
