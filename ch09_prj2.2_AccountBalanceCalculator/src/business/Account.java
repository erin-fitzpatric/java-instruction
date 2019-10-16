package business;

public class Account implements Depositable, Withdrawable, Balanceable {

	protected double balance;
	
	// generate constructor
	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double bal) {
		balance = bal;

	}

	@Override
	public void withdraw(double amt) {
		balance -= amt;
	}

	@Override
	public void deposit(double amt) {
		balance += amt;
	}

}
