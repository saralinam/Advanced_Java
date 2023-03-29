package thread.day02;

public class Brackets2 {

   void  generateBrackets(){

        //[[[[[]]]]]]
        //[[[[[]]]]]]

       // this --> the thread which is  calls this method
       // block or lock the method block
       // when the thread1 finished it is task , the block will be released for the thread 2
        synchronized (this){
            for (int i = 0; i <=10; i++) {
                if (i<5){
                    System.out.print("[");
                }else{
                    System.out.print("]");
                }
            }
            System.out.println("");
        }
        //deadly for few mis
      for (int i = 0; i <=5; i++) {
          try {
              Thread.sleep(50);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }

      }
    }
}
