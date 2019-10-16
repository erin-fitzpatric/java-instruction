package ch09_prj2_AccountBalanceCalculator;

public class Account implements Depositable, Withdrawable, Balanceable {

	private double balance;
	
	public Account() {
		super();
	}
	
	public Account(double balance) {
		super();
		this.balance = balance;
	}
	
	public double getBalance() {
		return balance;
	}

	@Override
	public void setBalance(double amount) {

	}

	@Override
	public void withdraw(double amount) {
		
	}

	@Override
	public void deposit(double amount) {

	}
	
}
