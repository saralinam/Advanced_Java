package multithreads.volatileKeyword;

public class Numerator {
    private volatile static int counter = 0;

    public void getOrder(){
        String name = Thread.currentThread().getName();
        synchronized (this){
            counter++;
            System.out.println("Dear "+name+" your number is: "+counter);
        }
    }
}
