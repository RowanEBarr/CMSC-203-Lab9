
public class CheckingAccount extends BankAccount {
	
	private static double FEE = 0.15;
	
	public CheckingAccount(String name, double amount) {
		super (name, amount);
		super.setAccountNumber(super.getAccountNumber() + "-10");
		
	}
	
	public boolean withdraw(double amount) {
		double finalAmount = amount + FEE;
		
		return super.withdraw(finalAmount);
	}

}
