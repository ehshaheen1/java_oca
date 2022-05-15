package test1;

public class ByteConvertInt61 {

	public static void main(String[] args) {

      byte b = -128 ;
      int i = b ;
      b = (byte) i;
      System.out.println(i+" "+b);

		/*
		 * int x = 1; int y = 0; if( x/y ) System.out.println("Good"); else
		 * System.out.println("Bad");
		 */
  }
}


