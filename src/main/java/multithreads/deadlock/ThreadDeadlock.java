package multithreads.deadlock;

/*
                Scenario:
                    Thread1: Locks resource1 and resource2.
                    Thread2: Locks resource2 and resource3.
                    Thread3: Locks resource3 and resource1.
 */

public class ThreadDeadlock {
    public static void main(String[] args) {
        String resource1 = "Resource1";
        String resource2 = "Resource2";
        String resource3 = "Resource3";

        Thread t1 = new Thread(new SyncThread(resource1, resource2));
        Thread t2 = new Thread(new SyncThread(resource2, resource3));
        Thread t3 = new Thread(new SyncThread(resource3, resource1));
        t1.start();
        t2.start();
        t3.start();
    }
}

class SyncThread implements Runnable{

    private String resource1;
    private String resource2;

    public SyncThread(String r1, String r2){
        this.resource1 = r1;
        this.resource2 = r2;
    }

    @Override
    public void run() {

        String name = Thread.currentThread().getName();
        System.out.println(name+" is acquiring lock on: "+resource1);
        synchronized (resource1){
            System.out.println(name+" has acquired lock on: "+resource1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(name+" is acquiring lock on: "+resource2);
            synchronized (resource2){
                System.out.println(name+" has acquired lock on: "+resource2);
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name+" has released the lock on: "+resource2);
            }
            System.out.println(name+" has released the lock on: "+resource1);
            System.out.println(name+" has finished execution.");
        }

    }
}