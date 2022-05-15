package test2;

public class ArrayCheck8 {

	public static void main(String[] args) {

      int i = 0 ;
      int[] iA = {10, 20} ;
      iA[i] = i = 30 ;
      System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
      
      int j = i=3 * i;
      System.out.println(j);
    }
}

