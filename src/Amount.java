/**
 * The Amount class represents a monetary value along with a transaction type.
 */
public class Amount {
    double amount;           // The monetary value.
    String transactionType;  // The type of transaction (e.g., DEPOSIT or WITHDRAW).

    /**
     * Constructor to initialize an Amount with a specified value and transaction type.
     *
     * @param amount The monetary value.
     * @param transactionType The type of transaction.
     */
    Amount(double amount, String transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }
}
