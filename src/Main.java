public class Main {
    public static void main(String[] args) {
        // Create a new PersonalAccount instance with account number 1 and account holder's name "+996 559 880 208".
        PersonalAccount acc = new PersonalAccount(1, "+996 559 880 208");

        // Add funds to the account.
        acc.addFunds(50);
        acc.addFunds(100);
        acc.addFunds(200);
        acc.addFunds(300);

        // Display the transaction history.
        acc.displayTransactionHistory();

        // Attempt to deduct funds from the account.
        acc.deductFunds(100);
        acc.deductFunds(500);

        // Print the current balance of the account.
        System.out.println("Current Balance: " + acc.getAccountBalance());
    }
}
