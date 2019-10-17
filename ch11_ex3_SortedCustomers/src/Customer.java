// modify the declaration for the Customer class so it implements the Comparable interface. 
// Then, start the declaration for the compareTo() method.
public class Customer implements Comparable<Customer> {

    private String email;
    private String firstName;
    private String lastName;

    public Customer(String email, String firstName, String lastName) {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public int compareTo(Customer otherCustomer) {
        return email.compareToIgnoreCase(otherCustomer.email);
    }
}
