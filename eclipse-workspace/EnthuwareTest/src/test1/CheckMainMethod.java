package test1;

import java.util.ArrayList;
import java.util.List;

public class CheckMainMethod {

	/*
	 * public static long main(String[] args){ System.out.println("Hello"); return
	 * 10L; }
	 */
  public static void main(String[] args) {
      List s1 = new ArrayList( );
      s1.add("a");
      s1.add("b");
      s1.add(1, "c");
      List s2 = new ArrayList(  s1.subList(1, 1) );
      s1.addAll(s2);
      System.out.println(s1);
   }
}
	



