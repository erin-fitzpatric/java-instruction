import java.util.Arrays;

public class SortedCustomersApp {
    public static void main(String[] args) {

        Customer [] customers = new Customer[3];

        customers[0] = new Customer("joel@murach.com", "Joel", "Murach");
        customers[1] = new Customer("anne@murach.com", "Anne", "Boehm");
        customers[2] = new Customer("mike@murach.com", "Mike", "Murach");
        
        // sort the array
        Arrays.sort(customers);

        for (Customer c : customers) {
            System.out.println(c.getEmail() + " " + c.getFirstName() + " " + c.getLastName());
        }
    }
}
