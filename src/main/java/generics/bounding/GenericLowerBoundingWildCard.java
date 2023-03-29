package generics.bounding;

import java.util.ArrayList;
import java.util.List;

// what  is WildCard ?  The Question mark is represented the WildCard  it  stand for Unknown type in generics
public class GenericLowerBoundingWildCard {

    public static void main(String[] args) {
        List<Object> ol= new ArrayList<>();
        addElements(ol);

        List<Number> nl= new ArrayList<>();
        addElements(nl);

        List<Integer> il= new ArrayList<>();
        addElements(il);

        List<Double> dl = new ArrayList<>();
        //addElements(dl);

        List<String> sl= new ArrayList<>();
        printString(sl);

        System.out.println("---------printElements -------");
        List<String> stringList= new ArrayList<>();
        stringList.add("java");
        stringList.add("generic");
        printElements(stringList);

        System.out.println("---------printObjects -------");
        List<Object> stringList2= new ArrayList<>();
        stringList.add("java");
        stringList.add("generic");
        printObject(stringList2);

    }

//super Integer --> it is brings  parent class of Integer
//extend  Integer --> it is brings  child  class of Integer
//parent of Integer Object ,Number,Integer
    public static void  addElements(List<? super Integer > list){
        for (int i=1; i<10; i++){
            list.add(i);
        }
    }

    public static void  printString(List<? super String > list){

    }

    // limitation of wildCard

    public static void printElements(List<?> listOfUnknown){
      //  listOfUnknown.add("java");// because of ? (unknown data tye ,add will not accept )
        listOfUnknown.add(null);
        for (Object o:listOfUnknown){
            System.out.println(o);
        }
    }


    public static void printObject(List<Object> listOfUnknown){
         listOfUnknown.add("java");// because of ? (unknown data tye ,add will not accept )
         listOfUnknown.add(1);// because of ? (unknown data tye ,add will not accept )
         listOfUnknown.add(3.5);// because of ? (unknown data tye ,add will not accept )
         listOfUnknown.add(3.5f);// because of ? (unknown data tye ,add will not accept )
        for (Object o:listOfUnknown){
            System.out.println(o);
        }
    }




}





