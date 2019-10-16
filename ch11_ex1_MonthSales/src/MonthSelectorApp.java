import java.text.NumberFormat;

public class MonthSelectorApp {

    public static void main(String[] args) {
        System.out.println("Monthly Sales\n");
        
        // TODO declare monthNames and monthSales arrays
        String [] monthNames = new String[12];
        monthNames [0] = "January";
        monthNames [1] = "February";
        monthNames [2] = "March";
        monthNames [3] = "April";
        monthNames [4] = "May";
        monthNames [5] = "June";
        monthNames [6] = "July";
        monthNames [7] = "August";
        monthNames [8] = "September";
        monthNames [9] = "October";
        monthNames [10] = "November";
        monthNames [11] = "December";
        
        Double [] monthSales = {2.0,4.0,6.0,8.0,10.0,12.0,14.0,16.0,18.0,20.0,22.0,24.0};

        // get currency formatting
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        
        // get one or more months
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            // get the input from the user
            int monthNumber = Console.getInt("Enter month number: ");
            
            // validate input
            if (monthNumber < 1 || monthNumber > monthNames.length) {
                Console.displayLine("Invalid month number. Try again.");
                continue;                
            }
            
            // get the index number for the month
            // and display the month name and sales            
            System.out.println("Sales for "+ monthNames[monthNumber] + " : " + currency.format(monthSales[monthNumber]));

            // check if the user wants to continue
            choice = Console.getString("Continue? (y/n): ");
            Console.displayLine();
        }
        
        // display the total sales for the year
        
        
        Console.displayLine();
    }    

}
