package oca.chapter4;

public class PassByValueAndReference {

	public static void main(String[] args) {
			int number = 1; // 1
			String letters = "abc"; // abc
		    number= number(number); // 1
		    System.out.println(number);
		    letters = letters(letters); // abcd
		    System.out.println(number + letters); // 1abcd
		 }
		 public static int number(int num) {
			 num++;
			 return num;
		 }
		 public static String letters(String letter) {
			 letter += "d";
			 return letter;
		 }
		

	}


