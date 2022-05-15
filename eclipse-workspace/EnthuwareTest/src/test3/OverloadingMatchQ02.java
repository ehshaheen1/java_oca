package test3;

public class OverloadingMatchQ02 {

  
  public static void printSum(double a, double b){
      System.out.println("In double "+(a+b));
  }
  public static void printSum(Integer a, Integer b){
      System.out.println("In Integer "+(a+b));
  }
  //1. Exact match
  //2. Widening
  //3. Boxing
  //4. Var Args
  public static void main(String[] args) {
      printSum(1, 2);
  }
}

