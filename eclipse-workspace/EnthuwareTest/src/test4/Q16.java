package test4;

import java.util.Arrays;

public class Q16 {

   public static void main(String[ ] args){
      int[] a = { 1, 2, 3, 4 };
      int[] b = { 2, 3, 1, 0 };
      System.out.println( a [ (a = b)[3] ] );
      System.out.println(Arrays.toString(a));
      System.out.println(Arrays.toString(b));
      
       new StringBuilder("OPs").replace(0, 7, "xxx-xxx-").toString();
   }
}


