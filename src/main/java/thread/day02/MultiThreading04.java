package thread.day02;

public class MultiThreading04 {
    public static void main(String[] args) {

        Brackets2 brackets2= new Brackets2();

      long starTime =   System.currentTimeMillis();

        // thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=7; i++) {
                    brackets2.generateBrackets();
                }
            }
        });
        thread1.start();
        //thread2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=7; i++) {
                    brackets2.generateBrackets();
                }
            }
        });

        thread2.start();
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("the end of thread ...");

        long endTime =   System.currentTimeMillis();
        System.out.println("time is execution to thread " +(endTime-starTime));
        //time is execution to thread 5106
       // time is execution to thread 2555

    }
}
