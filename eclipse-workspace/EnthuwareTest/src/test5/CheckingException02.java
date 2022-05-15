package test5;

class MyException extends Exception {}
public class CheckingException02{
   public static void main(String[] args) throws MyException{
	   CheckingException02 tc = new CheckingException02();
      try{
         tc.m1();
      }
      catch (MyException e){
         tc.m1();// As its check exception either you have to use try/catch or throws
      }
      finally{
         tc.m2();
      }
   }
   public void m1() throws MyException{
      throw new MyException();
   }
   public void m2() throws RuntimeException{
      throw new NullPointerException();
   }
}

