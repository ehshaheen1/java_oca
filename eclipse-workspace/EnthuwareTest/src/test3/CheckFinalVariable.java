package test3;

public class CheckFinalVariable {

	   static int si = 10;
	   int  i;
	   final static boolean bool;

		
		static {// We can initialized static final variable in static block but not from instance block
			 bool=true; 
	     }
		
		/*
		 * CheckFinalVariable() { bool= true; }
		 */
	public static void main(String[] args) {
		double ft= 4+1.0f;
		System.out.println(ft);
		System.out.println(4+1.0f);


 }

}