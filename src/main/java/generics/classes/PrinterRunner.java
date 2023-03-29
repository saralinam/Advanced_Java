package generics.classes;

public class PrinterRunner {
    public static void main(String[] args) {
        Print <Integer> print = new Print<>();
        print.setThingToBePrinted(56);
        print.print();

        Print <Double> doub=new Print<>();
        doub.setThingToBePrinted(65.7);
        doub.print();

        Print<String> str = new Print<>();
        str.setThingToBePrinted("Hello Generics");
       // str.setThingToBePrinted(54); //better to handle CTE
        str.print();
    }
}
