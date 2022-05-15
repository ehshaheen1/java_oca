package oca.chapter2;

public class IfElseStatementUnreach {

	public static void main(String[] args) {
		int hourOfDay =10;
		if(hourOfDay < 15) {
			System.out.println("Good Afternoon");
			} else if(hourOfDay < 11) {
			System.out.println("Good Morning"); // UNREACHABLE CODE
			} else {
			System.out.println("Good Evening");
			}
		
			/*
			 * int x = 1; if(x) { // DOES NOT COMPILE
			 * 
			 * }
			 */

	}

}
