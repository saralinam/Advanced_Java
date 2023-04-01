package multithreads.synchronization;

/*
        Create a simple appointment application
        The application has to give a new appointment one day after another.
 */
public class AppointmentApp {
    public static void main(String[] args) {
        String[] users = {"Tolstoy", "Victor Hugo", "Balzac", "JohnSteinbeck"};
        AppointmentCenter apCenter = new AppointmentCenter();
        for (String user:users){
            Thread thread1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Thread.currentThread().setName(user);
                    String name = Thread.currentThread().getName();
                    System.out.println("Dear "+name+", your appointment day is: "+apCenter.getAppointmentDay());
                }
            });
            thread1.start();
        }
    }
}
