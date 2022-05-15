package test4;

public class Q24FinallyRules {

   public static void main(String[] args) throws Exception{
      try{
         amethod();
         System.out.println("try ");
      }
      catch(Exception e){
         System.out.print("catch ");
      }
      finally   {
         System.out.print("finally ");
      }
      System.out.print("out ");
   }
   public static void amethod() throws Exception{
	   throw new Exception();
   }
}

// 1) If try does not have any exception then it will go to finally and rest of code

