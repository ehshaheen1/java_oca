package oca.chapter3;

public class StringTrmExample {

	public static void main(String[] args) {
		String x = "Hello World";
		String z = " Hello World".trim().intern();
		System.out.println(x == z); // false

	}

}
