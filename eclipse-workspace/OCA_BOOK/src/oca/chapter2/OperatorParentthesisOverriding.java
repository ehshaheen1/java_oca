package oca.chapter2;

public class OperatorParentthesisOverriding {

	public static void main(String[] args) {
		int y = 4;
		double x = (3 + 2) * --y; //Unless overridden with parentheses, Java operators follow order of operation,
		System.out.println(x);

	}

}
