package multithreads.threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AppointmentApp2 {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        String[] users = {"Gumball", "Nicole", "Darwin", "Richard", "Mr. Brown"};
        AppointmentCenter2 appointmentCenter = new AppointmentCenter2();
        for (String user:users){
            MyThread myThread = new MyThread(user, appointmentCenter);
            service.execute(myThread);
        }
        service.shutdown();
    }
}

class MyThread extends Thread{

    private String name;

    private AppointmentCenter2 appointmentCenter;

    public MyThread(String name, AppointmentCenter2 appointmentCenter) {
        this.name = name;
        this.appointmentCenter = appointmentCenter;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName+" has been started.");
        System.out.println("Dear "+name+", your appointment date is: "+appointmentCenter.getAppointmentDay());
        System.out.println(threadName+" has finished.");
    }
}
