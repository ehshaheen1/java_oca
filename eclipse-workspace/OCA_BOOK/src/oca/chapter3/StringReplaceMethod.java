package oca.chapter3;

public class StringReplaceMethod {

	public static void main(String[] args) {
		System.out.println("abcabc".replace('a', 'A')); // AbcAbc // It will replace all over the string
		System.out.println("abcabc".replace("a", "A")); // AbcAbc
		
		
		 String a = "abc";
		 String b = a.toUpperCase();
		 b = b.replace("B", "2").replace('C', '3');
		 System.out.println("a=" + a);
		 System.out.println("b=" + b);

	}

}
