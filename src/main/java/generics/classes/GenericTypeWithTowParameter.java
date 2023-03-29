package generics.classes;
// if we use more than one Data in generics class
public class GenericTypeWithTowParameter<U,S> {

    private U u;
    private S s;

    //constructor

    public GenericTypeWithTowParameter(U u, S s) {
        this.u = u;
        this.s = s;
    }

    // getter and setter


    public U getU() {
        return u;
    }

    public void setU(U u) {
        this.u = u;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

    public static void main(String[] args) {
        GenericTypeWithTowParameter<String,String> obj1 = new GenericTypeWithTowParameter<>("Ali","Can");
        GenericTypeWithTowParameter<String,Integer> obj2 = new GenericTypeWithTowParameter<>("Ali",1);
        GenericTypeWithTowParameter<Integer,String> obj3 = new GenericTypeWithTowParameter<>(2,"Can");

        System.out.println(obj1.getS()+ obj1.getU());
        System.out.println(obj2.getS());
        System.out.println(obj3.getS());

        System.out.println(obj1.getU());
        System.out.println(obj2.getU());
        System.out.println(obj3.getU());


    }
}
