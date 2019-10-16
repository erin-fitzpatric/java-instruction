package ch09_prj2_AccountBalanceCalculator;

public class Account implements Depositable, Withdrawable, Balanceable {

	protected double balance;
	
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


	public void withdraw(double amount) {
		balance -= amount;
	}


	public void deposit(double amount) {
		balance += amount;
	}
	
	public void setBalance(double amount) {
		balance = amount;
	}
	
}
