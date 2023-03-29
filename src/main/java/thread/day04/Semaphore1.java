package thread.day04;

import java.util.concurrent.Semaphore;
//what is th difference btw semaphore and synchronized?
public class Semaphore1 {
    public static void main(String[] args) throws InterruptedException {
        Semaphore semaphore = new Semaphore(4);// 4 cars can be parked at most
        Thread.sleep(2000);
        System.out.println("Available parking space is "+ semaphore.availablePermits());
        Car car1 = new Car("Car 1", semaphore);
        car1.start();
        Car car2 = new Car("Car 2", semaphore);
        car2.start();
        Car car3 = new Car("Car 3", semaphore);
        car3.start();
        Car car4 = new Car("Car 4", semaphore);
        car4.start();
        Car car5 = new Car("Car 5", semaphore);
        car5.start();
        Car car6 = new Car("Car 6", semaphore);
        car6.start();
    }
}

class Car extends Thread{

    private String carName;
    private Semaphore semaphore;
    //constructor


    public Car(String carName, Semaphore semaphore) {
        this.carName = carName;
        this.semaphore = semaphore;
    }

    @Override
    public void run() {

        try {
            System.out.println(carName+" is trying to park...");
            semaphore.acquire(); //is trying to get permission to acquire //start thread
            System.out.println(carName+ " parked");
            //suppose that each car can be parked for hours
            for(int i =1; i<=4; i++){
                System.out.println(carName+ " is parked for "+i+" hours");
                Thread.sleep(4000);
            }
            System.out.println(carName+" left the parking area...");
            semaphore.release(); //released the parking area for the waiting cars(thread completed task)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
