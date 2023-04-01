package multithreads.semaphore;


import java.util.concurrent.Semaphore;

/*
            We have 4 threads called A, B, C, D.

            We wanted them to run two-by-two. So we've used semaphore.

            We wanted each thread to increase the count by 1.

            So at first, we should see count goes to 2,
            then we should see that the count goes to 4.

            --> As I said, if-else was not a good practice here, so don't mind it.
 */

public class SemaphoreDemo {
    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(2);
        MyThread t1 = new MyThread("A", semaphore);
        MyThread t2 = new MyThread("B", semaphore);
        MyThread t3 = new MyThread("C", semaphore);
        MyThread t4 = new MyThread("D", semaphore);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        System.out.println("Count: "+Shared.count);

    }
}

class Shared{
    static int count = 0;
}

class MyThread extends Thread{

    private String name;
    private Semaphore semaphore;

    public MyThread(String name, Semaphore semaphore){
        this.name = name;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        System.out.println("Starting thread: "+name);
        try{
            System.out.println(name+" is waiting for a permit.");

            semaphore.acquire();
            System.out.println(name+" has got the permit.");

            Shared.count++;
            System.out.println(name+": "+Shared.count);

        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.println(name+" released the permit.");
        semaphore.release();

    }
}
