package enums.intro;

public class EnumTest {
    public static void main(String[] args) {
      benefitsOfEnumOverConstant();


    }

    public static void benefitsOfEnumOverConstant(){
        System.out.println("---------Constant Method --------");
        constantMethod(1);
        constantMethod(2);
        constantMethod(3);
        constantMethod(4);
        constantMethod(5);
        constantMethod(100); // it is not give complaining but is doing som unnecessary task.

        System.out.println("---------Enum over constant --------");
        enumMethod(TransactionType.DEPOSIT);
        enumMethod(TransactionType.WITHDRAW);
        enumMethod(TransactionType.TRANSFER);
        enumMethod(TransactionType.PAYMENT);
        enumMethod(TransactionType.OTHER);
       // enumMethod(TransactionType.AAA); we can get RTE OR CTE.

        System.out.println("--------------------");
        System.out.println("Transaction code for deposit : " + TransactionType.DEPOSIT.getTransactionCode());
        System.out.println("Transaction Ordinal  for deposit : " + TransactionType.DEPOSIT.ordinal());
        System.out.println("Transaction Name for deposit : " + TransactionType.DEPOSIT.name());

    }

    // constant method
    public static void constantMethod(int i){
        if (i== TransactionTypeConstant.DEPOSIT){
            System.out.println("Money is deposit ...");
        } else if (i==TransactionTypeConstant.WITHDRAW) {
            System.out.println("Money is WitDraw ...");
        }else if (i==TransactionTypeConstant.TRANSFER) {
            System.out.println("Money is TRANSFER ...");
        }else if (i==TransactionTypeConstant.PAYMENT) {
            System.out.println("Money is PAYMENT ...");
        } else if (i==TransactionTypeConstant.OTHER) {
            System.out.println("Money is Other ...");
        }
    }

    // create a method with Enum

    public static void enumMethod(TransactionType tt){

        /*
        // 1st way
        if (tt== TransactionType.DEPOSIT){
            System.out.println("Money is deposit ...");
        } else if (tt==TransactionType.WITHDRAW) {
            System.out.println("Money is WitDraw ...");
        }else if (tt==TransactionType.TRANSFER) {
            System.out.println("Money is TRANSFER ...");
        }else if (tt==TransactionType.PAYMENT) {
            System.out.println("Money is PAYMENT ...");
        } else if (tt==TransactionType.OTHER) {
            System.out.println("Money is Other ...");
        }


         */
        // 2nd way :

        switch (tt){
            case DEPOSIT :
                System.out.println("Money is deposit");
                break;
            case WITHDRAW:
                System.out.println("Money is WITHDRAW");
                break;
            case TRANSFER:
                System.out.println("Money is TRANSFER");
                break;
            case PAYMENT:
                System.out.println("Money is PAYMENT");
                break;
            case OTHER:
                System.out.println("Some Other Transaction Type");
                break;
            default:
                System.out.println("Unknown Transaction Type");


        }



    }




}
