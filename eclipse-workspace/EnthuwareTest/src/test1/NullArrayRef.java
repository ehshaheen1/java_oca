package test1;
//https://introcs.cs.princeton.edu/java/11precedence/
public class NullArrayRef {

   public static int[ ] getArray() {  return null;  }
   public static void main(String[] args){
      int index = 1;
      try{
    	 // System.out.println([2]);
         getArray()[index=2]++; //First [] will execute then it will get null[2] which will give you exception
      }
      catch (Exception e){  }  //empty catch
      System.out.println("index = " + index);
   }
}

