package test1;

abstract class CheckAbstract {

   abstract void calculate();
   public static void main(String[] args){
      System.out.println("calculating");
      CheckAbstract x = null;
      x.calculate();
   }
}

