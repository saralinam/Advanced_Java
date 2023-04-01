package multithreads.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class AppointmentApp {
    public static void main(String[] args) {

        CountDownLatch countDownLatch = new CountDownLatch(3);
        String[] users = {"Tolstoy", "C.Dickens", "V.Hugo"};
        AppointmentCenter appointmentCenter = new AppointmentCenter();
        for (String user:users){
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try{
                        countDownLatch.await();
                    }catch (InterruptedException e){
                        throw new RuntimeException(e);
                    }
                    System.out.println("Appointment date of the "+user+" is: "+appointmentCenter.getAppointmentDate());
                }
            });
            thread.start();
        }

        Worker worker1 = new Worker("A", countDownLatch);
        Worker worker2 = new Worker("B", countDownLatch);
        Worker worker3 = new Worker("C", countDownLatch);
        worker1.start();
        worker2.start();
        worker3.start();

    }
}
