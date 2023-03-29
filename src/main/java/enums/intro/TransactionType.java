package enums.intro;
//
public enum TransactionType {


    WITHDRAW(2),
    DEPOSIT(1),
    TRANSFER(3),
    PAYMENT(4),
    OTHER(5);

    private  final int TransactionCode;

    //constructor .
    // private access modifier is optional for Enum.
    TransactionType(int transactionCode) {
        TransactionCode = transactionCode;
    }
    //getter Method

    public int getTransactionCode() {
        return TransactionCode;
    }
}
