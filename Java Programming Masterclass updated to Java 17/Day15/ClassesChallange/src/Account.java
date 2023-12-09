public class Account {

    private String accountNumber;
    private double accountBalance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double money){
        this.accountBalance += money;
        System.out.println("New the balance of the account is $" + this.accountBalance + "\n$" + money + " are deposited");
    }

    public void withdraw(double money){
        if (money < 0){
            System.out.println("Money cannot be negative");
            return;
        }
        else if (money > this.accountBalance){
            System.out.println("There are no enough balance in account");
            return;
        }

        this.accountBalance -= money;
        System.out.println("New the balance of the account is $" + this.accountBalance + " because you withdrawed $" + money );

    }
}
