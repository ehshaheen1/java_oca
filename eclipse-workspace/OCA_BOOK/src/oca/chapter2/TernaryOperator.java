package oca.chapter2;

public class TernaryOperator {

	public static void main(String[] args) {
		int i = 5;
		String result = i % 2 == 0 ? "a" : i % 3 == 0 ? "b" : i % 5 == 0 ? "c" : i % 7 == 0 ? "d" : "e";; // Always compare result if true then print true if false then print false
		System.out.println(result);// Whenever we get the expected result then it will stop . Here it print c cause it get the result
		//System.out.println(1%3);
		

	}

}
