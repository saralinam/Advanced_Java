package thread.day04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        //to be able to start thread pool
        ExecutorService service =  Executors.newFixedThreadPool(3);

        //Thread instances are created
        ThreadCreator thread1 = new ThreadCreator("Thread 1");
        ThreadCreator thread2 = new ThreadCreator("Thread 2");
        ThreadCreator thread3 = new ThreadCreator("Thread 3");
        ThreadCreator thread4 = new ThreadCreator("Thread 4");
        ThreadCreator thread5 = new ThreadCreator("Thread 5");
        ThreadCreator thread6 = new ThreadCreator("Thread 6");
        ThreadCreator thread7 = new ThreadCreator("Thread 7");
        ThreadCreator thread8 = new ThreadCreator("Thread 8");
        ThreadCreator thread9 = new ThreadCreator("Thread 9");
        ThreadCreator thread10 = new ThreadCreator("Thread 10");

        //start thread normally
//        thread1.start();
//        thread2.start();
//        thread3.start();
//        thread4.start();
//        thread5.start();
//        thread6.start();
//        thread7.start();
//        thread8.start();
//        thread9.start();
//        thread10.start();

        //we are running threads using thread pool
        service.execute(thread1);
        service.execute(thread2);
        service.execute(thread3);
        service.execute(thread4);
        service.execute(thread5);
        service.execute(thread6);
        service.execute(thread7);
        service.execute(thread8);
        service.execute(thread9);
        service.execute(thread10);

        service.shutdown(); //to stop threads in pool after completing the task


    }
}

class ThreadCreator extends Thread{

    private String threadName;

    //constructor


    public ThreadCreator(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println(threadName+ " thread started ...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(threadName+" thread completed its task...");
    }
}
