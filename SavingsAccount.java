
public class SavingsAccount extends BankAccount {
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		accountNumber = (super.getAccountNumber() + "-" + savingsNumber);
		
	}
	
	public SavingsAccount (SavingsAccount s, double amount) {
		super (s, amount);
		this.savingsNumber = s.savingsNumber +1;
		accountNumber = (super.getAccountNumber() + "-" + this.savingsNumber);
	}
	
	public void postInterest() {
		super.setBalance(super.getBalance()+ (super.getBalance()*rate/12));
	}
	
	public String getAccountNumber()
	{
		return accountNumber;
	}
	
	

}
