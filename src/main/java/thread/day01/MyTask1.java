package thread.day01;

public class MyTask1 {
    void executeTask(){

        for (int i = 1; i <=10 ; i++) {

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Printer 1 is working "+i);

        }
    }
}
