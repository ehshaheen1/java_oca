package test1;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class LambdaException43 {

   public static boolean checkList(List list, Predicate<List> p){  // P has reference type List so p holds  al -> al.isEmpty());
      return p.test(list);// It will call al.isEmpty() so return true 
   }
  
   public static void main(String[] args) {
      boolean b = checkList(new ArrayList(), al -> al.isEmpty());
      System.out.println(b);
   }
}

