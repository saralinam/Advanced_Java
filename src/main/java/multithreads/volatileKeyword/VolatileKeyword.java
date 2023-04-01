package multithreads.volatileKeyword;

public class VolatileKeyword {
    /*
           Task: Create an application that gives user a line number (Numerator).
    */
    public static void main(String[] args) {
        Numerator numerator = new Numerator();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread1.setName("John");
        thread1.start();

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread2.setName("Josh");
        thread2.start();

        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread3.setName("Elsa");
        thread3.start();

        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                numerator.getOrder();
            }
        });
        thread4.setName("Olaf");
        thread4.start();
    }
}
