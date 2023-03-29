package generics.classes;

import java.util.ArrayList;
import java.util.List;

public class NonGenericsRunner {
    public static void main(String[] args) {
        NonGenerics nonGenerics1 = new NonGenerics();
        NonGenerics nonGenerics2 = new NonGenerics();
        NonGenerics nonGenerics3 = new NonGenerics(87.4);

        nonGenerics1.setObj(45);
        nonGenerics2.setObj("Generics");

        Integer number = (Integer) nonGenerics1.getObj(); //it requires us to use type cast

        String str = (String) nonGenerics2.getObj();

        String str2 = (String) nonGenerics3.getObj(); //no Compile Time Error. It will give RTE: ClassCastException


        //ArrayLis to store all of data types
        List<Object> list = new ArrayList<>();
        list.add(34);
        list.add("String");

        Integer num2 = (Integer) list.get(0);
        String str3 = (String) list.get(1);
        String str4 = (String) list.get(0);//no Compile Time Error. It will give RTE: ClassCastException
        //String.valueOf()
        //Integer.parseInt()

    }
}
