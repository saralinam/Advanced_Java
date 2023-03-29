package thread.day01;

public class CreateThreads {

    public static void main(String[] args) {
        //Whatever we write in here will be executed by main method
        //Job 3 will wait until job 2 to be completed, that is because
        // if there is no thread used everything work in sequential order


        //job 1
        System.out.println("--------Application without Thread is started....... ");
        //job2
        MyTask  myTask= new MyTask();
        myTask.executeTask();
        //job 3

        for (int i = 0; i <=10 ; i++) {
            System.out.println("printer 1 is working " +i);
        }

        //job 4
        System.out.println("--------Application without Thread is finished....... ");

        // job1 1
        System.out.println("--------Application with Thread is started....... ");

        //Now Job3 does not wait for job2 to be completed. They are being executed by the different threads
        //at the same time... so they are working concurrently.
        //job2
        MyTaskWithThread myTaskWithThread= new MyTaskWithThread();
        myTaskWithThread.start();

        //job 3
        MyTaskWithThread2 myTaskWithThread2= new MyTaskWithThread2();
        Thread thread = new Thread(myTaskWithThread2);
        thread.start();

        //job 4
        System.out.println("--------Application with Thread is finished....... ");
        // 3th option to create a thread

        Thread thread1= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("This is a anonymous thread ......");
            }
        });
        thread1.start();

        // 4th option to create a thread
        Thread thread2= new Thread(()->{
            System.out.println("This is thread with lambda expresstion ");
        });
        thread2.start();
    }

}

class MyTask{

    static void executeTask(){
        for (int i = 0; i <=10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("printer 2 is working " +i);

        }

    }
}

// 1st way to create a new thread
class MyTaskWithThread  extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("printer 3 is working "+i);
        }
    }
}

// 2nd way to create a new thread

class MyTaskWithThread2  implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("printer 4 is working "+i);
        }
    }
}


