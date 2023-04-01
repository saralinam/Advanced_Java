package multithreads.creation;

public class ThreadCreation2 {
    /*
            Task2: Create a CounterB class which implements the Runnable interface.

            Then, create two threads which prints the alphabet from A to Z.
     */
    public static void main(String[] args) {
        CounterB counter1 = new CounterB("RoadRunner");
        CounterB counter2 = new CounterB("SpeedyGonzales");

        Thread thread1 = new Thread(counter1);
        Thread thread2 = new Thread(counter2);

        thread1.start();
        thread2.start();
    }
}
