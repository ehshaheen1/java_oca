package oca.chapter3;

public class StringBuilderApend {

	public static void main(String[] args) {
		StringBuilder a = new StringBuilder("abc"); //abcde
		 StringBuilder b = a.append("de"); //b=abcde
		 b = b.append("f").append("g");
		 System.out.println("a=" + a);
		 System.out.println("b=" + b);
		 
		 
		 StringBuilder sb = new StringBuilder();
		 sb.append("Enad");
		 System.out.println(sb.length());
		 System.out.println(sb.capacity());

	}

}
