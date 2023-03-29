package thread.day01;

public class MyThread extends Thread{
    Printer printer;

    public MyThread(Printer printer) {
        this.printer = printer;
    }
    @Override
    public void run() {
            printer.printDocuments(10,"Fatih  Documents");
    }
}
