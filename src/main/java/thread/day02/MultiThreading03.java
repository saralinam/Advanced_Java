package thread.day02;

public class MultiThreading03 {
    public static void main(String[] args) {

        Brackets1 brackets1 = new Brackets1();

        // thread 1
        Thread thread1 = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i <=7; i++) {
                    brackets1.generateBrackets();
                }
            }
        });
        thread1.start();
        //thread 2

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <=7; i++) {
                    brackets1.generateBrackets();
                }
            }
        });


//        try {
//            thread1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        thread2.start();

    }

}
