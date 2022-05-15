package oca.chapter2;

public class ForLoop {

	public static void main(String[] args) {
	
		/*
		 * int x = 0; for(long y = 0, z = 4; x < 5 && y < 10; ++x, ++y) {
		 * System.out.print(y + " "); } System.out.println(); System.out.print(x);
		 */
		
		//int x = 0;
		for(long x = 0, y = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE // Variable should be unique here x already initialized
		//System.out.print(x + " ");
		}
		
		/*
		 * int x = 0; long y = 10; for(y = 0, x = 4; x < 5 && y < 10; x++, y++) { // Its
		 * not a chain variable declaration.Here inside for loop there is no type so no
		 * problem System.out.print(x + " "); }
		 */

		//for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE // Chain variable has be same type
		//	System.out.print(x + " ");
			//}
	}

}
