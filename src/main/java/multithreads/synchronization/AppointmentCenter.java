package multithreads.synchronization;

import java.time.LocalDate;

public class AppointmentCenter {
    private LocalDate day = LocalDate.now();

    public synchronized LocalDate getAppointmentDay(){
        day = day.plusDays(1);
        return day;
    }
}
