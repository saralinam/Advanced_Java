package thread.day01;

public class MultiThreading01 {

    public static void main(String[] args) {

        long  appNoThreadStarted = System.currentTimeMillis();
        System.out.println("Application without Thread is started ......");
        //task1
        MyTask1 myTask1= new MyTask1();
        myTask1.executeTask();

        // task 2
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("printer 2 is working ");

        }
        System.out.println("Application without Thread is  finished");

        long  appNoThreadEnd = System.currentTimeMillis();

        System.out.println("Total execution time is without Thread "+(appNoThreadEnd-appNoThreadStarted));
        //Total execution time is without Thread 1581

        long  appWithThreadStart = System.currentTimeMillis();
        System.out.println("Application with Thread is  started");
        //task1
        MyTaskWithThread1 myTaskWithThread1= new MyTaskWithThread1();
        myTaskWithThread1.start();
        try {
            myTaskWithThread1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // task 2
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 4 is working "+ i);
        }
        //join() method waits to die/terminate task1 should  be finished  task should be start.

        long  appWithThreadEnd = System.currentTimeMillis();
        System.out.println("Application with Thread is ending");
        System.out.println("Total time is passed  for the app with Thread "+(appWithThreadEnd-appWithThreadStart));
        //Total time is passed  for the app with Thread 530


    }
}
