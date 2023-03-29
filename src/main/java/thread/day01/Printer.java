package thread.day01;

public class Printer {

    // this is the second way to synchronize out thread
    // it is block or lock the method for one thread a time .
  synchronized void  printDocuments(int numOfCopies,String docName){

        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 1; i <=numOfCopies; i++) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">> Print "+docName +" "+i);

        }

    }
}
