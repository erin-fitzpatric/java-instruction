package ch11_prj3_SalesReport;

import java.text.NumberFormat;

public class SalesReportApp {

	public static void main(String[] args) {
		NumberFormat n = NumberFormat.getCurrencyInstance();
// region array
		final int numQuarters = 4;

		int[] regionNumber = { 1, 2, 3, 4 };

		// sales array
		double[][] sales = { { 1540.0, 2010.0, 2450.0, 1845.0 }, // Region 1
				{ 1130.0, 1168.0, 1847.0, 1491.0 }, // Region 2
				{ 1580.0, 2305.0, 2710.0, 1284.0 }, // Region 3
				{ 1105.0, 4102.0, 2391.0, 1576.0 } // Region 4
		};
		System.out.println("The Sales Report Application\n");

		// Display Region and each quarter
		System.out.println("Region	Q1		Q2		Q3		Q4");
		for (int i = 0; i < sales.length; i++) {

			int region = regionNumber[i];
			System.out.print(region + " 	");

			for (int j = 0; j < sales[i].length; j++) {
				System.out.print(n.format(sales[i][j]) + "	");
			}
			System.out.print("\n");
		}

		// Sales by region
		System.out.println("\nSales by Region:");
		for (int m = 0; m < regionNumber.length; ++m) {
			double regionSales = 0;
			for (int i = 0; i < sales.length; i++) {
				regionSales += sales[m][i];
			}
			System.out.println("Region " + (m + 1) + ": " + n.format(regionSales));
		}

		System.out.print("\n");

		// Sales by Quarter
		System.out.println("\nSales by Quarter:");
		for (int l = 0; l < numQuarters; ++l) {
			double quarterSales = 0;
			for (int i = 0; i < sales.length; i++) {
				quarterSales += sales[i][l];
			}
			System.out.println("Q" + (l + 1) + ": " + n.format(quarterSales));
		}

		System.out.print("\n");

		// Total Sales
		double totalSales = 0;
		for (int i = 0; i < sales.length; i++) {
			for (int j = 0; j < sales[i].length; j++) {
				totalSales += sales[i][j];
			}
		}
		System.out.println("Total Sales: " + (n.format(totalSales)));
	}
}
