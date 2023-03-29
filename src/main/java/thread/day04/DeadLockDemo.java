package thread.day04;

public class DeadLockDemo {
    public static void main(String[] args) {
        final String eraser = "eraser";
        final String ruler = "ruler";

        //thread 1
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (eraser) {
                    System.out.println(Thread.currentThread().getName()+" is using eraser");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (ruler){
                        System.out.println(Thread.currentThread().getName()+" is using ruler");
                    }
                }
            }
        });

        thread1.setName("Sara");
        thread1.start();

        //thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (ruler) {
                    System.out.println(Thread.currentThread().getName()+" is using ruler");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    synchronized (eraser){
                        System.out.println(Thread.currentThread().getName()+" is using eraser");
                    }
                }
            }
        });
        thread2.setName("Yusuf");
        thread2.start();
    }
}
