package thread.day01;

public class MultiThreading02 {

    public static void main(String[] args)   {
        System.out.println("-------Application with Thread is started------------------------");
         Printer printer = new Printer();

         MyThread myThread = new MyThread(printer);
         YourThread yourThread = new YourThread(printer);
          myThread.start();
        // this is the first way to synchronize the thread .
//        try {
//            myThread.join();// your thread wait for MyThread to finish print documents
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
          yourThread.start();
         // yourThread.run();///Note: If you call run() method you just call the run method it will not start the thread
        try {
            yourThread.join();
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Application  with thread is finished");
    }

}
