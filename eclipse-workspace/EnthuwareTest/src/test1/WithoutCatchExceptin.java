package test1;

public class WithoutCatchExceptin {
public static void main(String[] args) throws Exception {

       try{
          m1();
          System.out.println("A");
       }// If try has catch then it will print all the statement after finally other than its not 
       finally{
          System.out.println("B");
       }
       System.out.println("C");
   }
   public static void m1() throws Exception { throw new Exception(); }
}

