package generics.classes;

/*
    T --> Type
    E --> Element
    K --> Key
    V --> Value
    N --> Number

    S, U, ..
 */

public class Print <T>{
    private T thingToBePrinted;

//    getter and Setter


    public T getThingToBePrinted() {
        return thingToBePrinted;
    }

    public void setThingToBePrinted(T thingToBePrinted) {
        this.thingToBePrinted = thingToBePrinted;
    }

    public void print(){
        System.out.println(thingToBePrinted);
    }
}
