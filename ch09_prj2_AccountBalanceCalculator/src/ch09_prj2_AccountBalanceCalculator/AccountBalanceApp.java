package ch09_prj2_AccountBalanceCalculator;

import java.text.NumberFormat;

public class AccountBalanceApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Application\n");

		NumberFormat n = NumberFormat.getCurrencyInstance();

		CheckingAccount checking = new CheckingAccount(1, 1000);
		SavingsAccount saving = new SavingsAccount(.05, 1000);

		System.out.println("Starting Balances");
		System.out.println("Checking: " + n.format(checking.getBalance()));
		System.out.println("Savings: " + n.format(saving.getBalance()) + "\n");

		System.out.println("Enter the transactions for the month\n");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			String withdrawDeposit = Console.getString("Withdrawal or deposit? (w/d): ");
			String checkingSavings = Console.getString("Checking or savings? (c/s): ");
			double amount = Console.getDouble("Amount?: ");

			Account a = null;

			if (checkingSavings.equalsIgnoreCase("c")) {
				a = checking;
			}
			else {
				a = saving;
			}

			if (withdrawDeposit.equalsIgnoreCase("w")) {
				a.withdraw(amount);
			} else {
				a.deposit(amount);
			}

			choice = Console.getString("Continue? (y/n): \n");
		}

		checking.applyMonthlyFee();
		saving.applyInterest();

		System.out.println("Monthly Payments and Fees");
		System.out.println("Checking fee: 		      " + n.format(checking.getMonthlyFee()));
		System.out.println("Savings interest payment: " + n.format(saving.getMonthlyInterestPayment()));

		System.out.println("Final Balances");
		System.out.println("Checking: " + n.format(checking.getBalance()));
		System.out.println("Savings: " + n.format(saving.getBalance()) + "\n");

	}

}
