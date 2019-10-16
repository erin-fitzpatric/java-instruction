package ch09_prj2_AccountBalanceCalculator;

public class CheckingAccount extends Account {
	double monthlyFee;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double monthlyFee, double initBalance) {
		super(initBalance);
		this.monthlyFee = monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public void applyMonthlyFee() {
		balance -= monthlyFee;	
	}
	
	
	
}
