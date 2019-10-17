package ch11_prj1_BattingStatistics;
import java.text.NumberFormat;

public class BattingStatisticsApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator\n");

		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			// create array for player 1 and player 2

			int atBat = Console.getInt("Enter number of times at bat: ", 1, 30);

			int[] battingStats = new int[atBat];

			System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
			
			for (int i = 1; i <= atBat; i++) {
				battingStats[i-1] = Console.getInt("Result for at bat " + i + ": ", 0, 4);
			}
			
			int battingTotal = 0;
			int sluggingTotal = 0;
			for (int b : battingStats) {
				sluggingTotal += b;
				if (b > 0) {
					battingTotal += 1;
				} 
			}
			
			// The batting average is the total number of at bats for which the player earned at least one base divided by the number of at bats.
			NumberFormat n = NumberFormat.getInstance();
			n.setMaximumFractionDigits(3);
			
			double battingAverage = battingTotal / (double)battingStats.length;	
			System.out.println("\nBatting average: " + n.format(battingAverage));
			
			// The slugging percentage is the total number of bases earned divided by the number of at bats.
			double sluggingPercentage = sluggingTotal / (double)battingStats.length;
			System.out.println("Slugging percentage: " + n.format(sluggingPercentage) + "\n");

			choice = Console.getString("Another player? (y/n): \n");
		}
		System.out.println("Good Bye!");
	}

}
