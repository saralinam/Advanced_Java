package thread.day03;

import java.util.concurrent.CountDownLatch;

public class CountDownLatch01 {

    public static void main(String[] args) {
  // CountDownLatch is used to make sure that a task waits for other threads before it starts.
        CountDownLatch latch= new CountDownLatch(4);
        // thread
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    latch.await();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println("Thread 1 is running ....");
            }
        });
        thread1.start();
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
//                try {
//                    latch.await();
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
                System.out.println("Thread 2 is running ....");
            }
        });

        thread2.start();

        // lets create out task
        AssignTaskThread team1 = new AssignTaskThread(2000,latch,"Team-1");
        AssignTaskThread team2 = new AssignTaskThread(4000,latch,"Team-2");
        AssignTaskThread team3 = new AssignTaskThread(5000,latch,"Team-3");
        AssignTaskThread team4 = new AssignTaskThread(6000,latch,"Team-4");
        // lets start all the threads
        team1.start();
        team2.start();
        team3.start();
        team4.start();
        try {
            latch.await();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("main Thread has finished");
        System.out.println("Code is ready to be submitted To QA Team....");
    }
}

class AssignTaskThread extends Thread{
    private int delay;
    private CountDownLatch latch;
    public AssignTaskThread(int delay, CountDownLatch latch,String name) {
        super(name);
        this.delay = delay;
        this.latch = latch;
    }
    @Override
    public void run() {
        try {
            System.out.println(Thread.currentThread().getName()+" Team  is start ..");
            Thread.sleep(delay);
            System.out.println(Thread.currentThread().getName()+" Teams  finished ...");
            latch.countDown();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


