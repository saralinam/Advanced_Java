package multithreads.creation;


public class ThreadCreation1 {
    public static void main(String[] args) {

        /*
                Task 1: Create a Counter class that extends Thread class.
                Create two threads from Counter class, that will count from 1 to 100.
         */

        CounterA thread1 = new CounterA("RoadRunner");
        CounterA thread2 = new CounterA("SpeedyGonzales");

        thread1.start();
        thread2.start();


    }
}
