package oca.chapter1;

public class DecimelOperationUnderscore {

	public static void main(String[] args) {
		//int x= 1200; // int has same rule as well 
		//Underscore cant be in first and last and between decimal point 
		//double notAtStart = _1000.00; // DOES NOT COMPILE
		//double notAtEnd = 1000.00_; // DOES NOT COMPILE
		//double notByDecimal = 1000_.00; // DOES NOT COMPILE
		double annoyingButLegal = 1_00_0.0_0; // this one compiles
		//declare and initialization for chanining not possible if variable is not declared
		int i2,i3;
		int i1=i2=i3= 0;
		
		//int num, String value; // DOES NOT COMPILE //This code doesn�t compile because it tries to declare multiple variables of different types
		//in the same statement.
		
		//double d1, double d2; //Multi variable does not allow second same type. Only one type is present
		String s1 = "1", s2,s3="3",s4,s5; // Multiple variable can be defined and undefined together but first we have to declare single data type

	}

}
