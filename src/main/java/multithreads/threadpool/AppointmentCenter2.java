package multithreads.threadpool;

import java.time.LocalDate;

public class AppointmentCenter2 {
    private LocalDate day = LocalDate.now();

    public synchronized LocalDate getAppointmentDay(){
        day=day.plusDays(1);
        return day;
    }
}
