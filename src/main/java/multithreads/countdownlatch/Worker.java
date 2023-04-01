package multithreads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Worker extends Thread{
    private String name;
    private CountDownLatch latch;

    public Worker(String name, CountDownLatch latch){
        this.name=name;
        this.latch = latch;
    }

    @Override
    public void run() {
        System.out.println(name+" thread has been started.");
        System.out.println(name+" thread is processing...");
        System.out.println(name+" thread is done.");
        latch.countDown();
    }
}
