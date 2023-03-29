package thread.day02;

public class Brackets1 {

    synchronized void  generateBrackets(){

        //[[[[[]]]]]]
        for (int i = 0; i <=10; i++) {
            if (i<5){
                System.out.print("[");
            }else{
                System.out.print("]");
            }
        }
        System.out.println("");
    }
}
