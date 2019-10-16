package ch09_prj2_AccountBalanceCalculator;

public class SavingsAccount extends Account {
	double monthlyInterestRate;
	double monthlyInterestPayment;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double monthlyInterestRate, double initBalance) {
		super(initBalance);
		this.monthlyInterestRate = monthlyInterestRate;
	}
	
	public void applyInterest() {
		monthlyInterestPayment = (balance * monthlyInterestRate);
		balance += monthlyInterestPayment;
	}
	
	public double getMonthlyInterestPayment() {
		return monthlyInterestPayment;
	}
}
