package test1;

public class LoopingQ12 {

	public static void main(String[] args) {

      int i;
      int j;
      for (i = 0, j = 0; j < i; ++j, i++){ // Here i and j initialized to 0 then did not go inside the loop
         System.out.println(i + " " + j);
      }
      System.out.println(i + " " + j);
   }


	}


