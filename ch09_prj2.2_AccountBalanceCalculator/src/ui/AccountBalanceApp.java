package ui;

import java.text.NumberFormat;

import business.Account;
import business.CheckingAccount;
import business.SavingsAccount;
import util.Console; 

public class AccountBalanceApp {
	static NumberFormat cf = NumberFormat.getCurrencyInstance();

	public static void main(String[] args) {
		System.out.println("Welcome to the Account Balance Calculator App");

		CheckingAccount ca = new CheckingAccount(1000, 1);
		SavingsAccount sa = new SavingsAccount(1000, .01);

		System.out.println("Starting Balances: ");
		displayBalances(ca, sa);
		System.out.println("Enter transactions for the month: ");

		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			String txn = Console.getString("Withdraw or Deposit? (c/d)");
			String acct = Console.getString("Checking or Savings? (c/s)");
			double amt = Console.getDouble("Ammount?", 0, Double.POSITIVE_INFINITY);

			Account a = null;
			if (acct.equalsIgnoreCase("c")) {
				a = ca;
			} else if (acct.equalsIgnoreCase("s")) {
				a = sa;
			} else {
				System.out.println("Invalid account type!");
				continue;
			}
				
			if (txn.equalsIgnoreCase("w")) {
				a.withdraw(amt);
			} else if (txn.equalsIgnoreCase("d")) {
				a.deposit(amt);
			} else {
				System.out.println("Invalid txn.");
				continue;
			}
			
			choice = Console.getString("Continue? (y/n): ");
		}

		ca.subtractMonthlyFeeFromBalance();
		sa.applyPaymentToBalance();

		System.out.println("Monthly Payments and Fees: ");
		System.out.println("Checking Fee: " + ca.getMonthlyFee());
		System.out.println("Savings Interest Payment: " + sa.getMonthlyInterestPayment());

		System.out.println("Final Balances:");
		displayBalances(ca, sa);

		System.out.println("Bye");
	}

	private static void displayBalances(CheckingAccount ca, SavingsAccount sa) {
		System.out.println("Checking " + cf.format(ca.getBalance()));
		System.out.println("Savings " + cf.format(sa.getBalance()));
	}

}
