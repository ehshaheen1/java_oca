package test3;

public class ExceptionHandCaseQ04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseFloat("ops");
	}
	

public static float parseFloat(String s){
   float f = 0.0f;
   try{
      f = Float.valueOf(s).floatValue();
      return f ;
   }
   catch(NumberFormatException nfe){
      System.out.println("Invalid input " + s);
      f = Float.NaN ;
      //return f;
   }
   finally { System.out.println("finally");  }
   return f ;
 }
}
