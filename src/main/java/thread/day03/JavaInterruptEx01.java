package thread.day03;

public class JavaInterruptEx01 extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            System.out.println("advance java interrupt");
        } catch (InterruptedException e) {
          // throw new RuntimeException(e);
           System.out.println("Thread is interrupted");
        }
        System.out.println("Thread is running");

    }

    public static void main(String[] args) {

        JavaInterruptEx01 thread1= new JavaInterruptEx01();
        thread1.start();
        thread1.interrupt();

        JavaInterruptEx01 thread2= new JavaInterruptEx01();
        thread2.start();
        thread2.interrupt();

    }
}
