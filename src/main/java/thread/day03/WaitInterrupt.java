package thread.day03;

public class WaitInterrupt {
    public static int balance=0;

    public static void main(String[] args) {

        WaitInterrupt obj= new WaitInterrupt();
        // thread 1
        Thread withDrawThread= new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    Thread.sleep(5000);
//                } catch (InterruptedException e) {
//                   // throw new RuntimeException(e);
//                    System.out.println("withDrawThread is interrupted");
//                }
                obj.WithDraw(500);
            }
        });
        withDrawThread.setName("withdraw thread");
        withDrawThread.start();

        //thread 2

        Thread depositThread= new Thread(new Runnable() {
            @Override
            public void run() {
                obj.deposit(500);
                withDrawThread.interrupt();
            }
        });
        depositThread.setName("withdraw thread");
        depositThread.start();

    }
    public synchronized void WithDraw(int amount){
        System.out.println(Thread.currentThread().getName() +" receive money");
        if (balance<=0 || balance<amount){
            System.out.println("waiting for the deposit to updated ...");
            try {
                wait();// it is wait up tp we call notify() or notifyAll() method
            } catch (InterruptedException e) {
                if (balance>=amount){
                    balance=balance-amount;
                    System.out.println("withDraw is successful ,the current balance is "+balance);
                }else{
                    System.out.println("the balance is not enough"+balance);
                    System.out.println("Please deposit one more times.");
                }
            }
        }
    }
    public synchronized void deposit(int amount){
        System.out.println(Thread.currentThread().getName()+"   sent money fro students ");
        balance= balance+amount;
        System.out.println("the amount is deposit ,the current balance is "+balance);

    }

}


