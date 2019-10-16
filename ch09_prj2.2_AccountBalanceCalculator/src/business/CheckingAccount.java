package business;

public class CheckingAccount extends Account {
	private double monthlyFee;

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}

	public double getMonthlyFee() {
		return monthlyFee;
	}

	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	public void subtractMonthlyFeeFromBalance() {
		this.balance -= monthlyFee;
	}
	
}
