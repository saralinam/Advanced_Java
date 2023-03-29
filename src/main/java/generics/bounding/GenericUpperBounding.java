package generics.bounding;

public class GenericUpperBounding<T extends Number> {// setting boundary from Upper
    // -- it is only we can use sub-class of NUMBER .
    private T[] numberArray;//filed ..
    //Constructor

    public GenericUpperBounding(T[] numberArray) {
        this.numberArray = numberArray;
    }
    // create a method find the average of ann array.

    public double getAverage(){
        double sum=0;
        for (T t:numberArray ){
            sum+=t.doubleValue();//"doubleValue" convert elements to double data type ..
        }
        double avg=sum/numberArray.length;
        return avg;
    }

    // let 's Create main method

    public static void main(String[] args) {

        Integer [] intArr= {2,4,5,6,7,8,9};
        GenericUpperBounding<Integer> obj1= new GenericUpperBounding<>(intArr);
        System.out.println(obj1.getAverage());

        Double [] doubleArr= {4.5,4.6,5.6,6.7};
        GenericUpperBounding<Double> obj2= new GenericUpperBounding<>(doubleArr);
        System.out.println(obj2.getAverage());

        Float [] floatArr= {4.5f,4.6f,5.6f,6.7f};
        GenericUpperBounding<Float> obj3= new GenericUpperBounding<>(floatArr);
        System.out.println(obj3.getAverage());

        // String Array

        String [] strArr ={"Ali","Max","Kasim"};
//        GenericUpperBounding<String> obj4= new GenericUpperBounding<>(strArr);
//        System.out.println(obj4.getAverage()); // it will save us from RTE .... TypeCasting .


    }

}
