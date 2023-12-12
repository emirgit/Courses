public class Main {
    public static void main(String[] args) {
        Account account = new Account("213214", 100, "deneme@gmail.com",
                "Ali Deneme", "+90 541 314 16 41");



 /*
        account.setAccountNumber("213214");
        account.setAccountBalance(100);
        account.setEmail("deneme@gmail.com");
        account.setCustomerName("Ali Deneme");
        account.setPhoneNumber("+90 541 314 16 41");
*/
        account.deposit(150);
        account.withdraw(-50);
        account.withdraw(300);
        account.withdraw(250);


    }
}