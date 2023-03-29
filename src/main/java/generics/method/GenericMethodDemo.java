package generics.method;

import java.util.Arrays;

public class GenericMethodDemo {

    public static void main(String[] args) {

        GenericMethodDemo obj= new GenericMethodDemo();

        System.out.println("-----print array with none generic methods------");
        Integer [] intArray = {3,5,6,7,8,9,12,13};
        obj.print(intArray);
        Double [] doubleArray={4.5,6.5,7.5,8.5,9.5};
        obj.print(doubleArray);

        Float [] floatArray={1f,4f,6f,8f,9f,10f,34f};
        obj.print(floatArray);

        String [] strArray= {"Sara","Rahman","Fatih","Burak"};
        obj.print(strArray);

        System.out.println();

        System.out.println("------------Print Array with generic method ----------------");
        obj.print(intArray);
        obj.print(doubleArray);
        obj.print(strArray);
        obj.print(floatArray);

        // let's print array with method

    }

    //without generic method
    public static void print(Integer[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
    }
    public static void print(Double[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
    }

    public static void print(String[] arr){
        Arrays.stream(arr).forEach(t-> System.out.print(t+" "));
    }

    // create Generic method for printing Array.
    public <T> void print(T [] array){
        for(T t:array ){
            System.out.println(t + " ");
        }
    }



}
