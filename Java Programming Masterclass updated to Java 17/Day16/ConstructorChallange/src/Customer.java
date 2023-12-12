public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    // -1 means for undetermined credit limit

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Default Name", "default@hotmail.com");

    }

    public Customer(String name, String email) {
        this(name, -1, email);

    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
