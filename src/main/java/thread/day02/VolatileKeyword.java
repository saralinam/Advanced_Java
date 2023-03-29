package thread.day02;

public class VolatileKeyword {

    //volatile keyword is used to modify the value of a variable by different threads
    // The volatile variables are always visible to other threads.
    //You can use the volatile keyword with variables. Using volatile keyword with classes and methods is illegal.
    //the volatile keyword is used to read data from main method, not from the cache memory

    public volatile static int counter =0;

    public static void main(String[] args) {

        //thread 1
        Thread  thread1 = new Thread(()->{
            int local_counter = counter;
            while (local_counter <10){
                if(local_counter!=counter){
                    System.out.println("[T1] local counter is change ....");
                    local_counter=counter;
                }
            }
        });

        //Thread thread2
        Thread thread2 = new Thread(()->{
            int local_counter=counter;
            while (local_counter<10){
                System.out.println("[T2 ] local counter is increase :"+(local_counter+1));
                counter=++local_counter;
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });


        // start thread
        thread1.start();
        thread2.start();

    }
}
