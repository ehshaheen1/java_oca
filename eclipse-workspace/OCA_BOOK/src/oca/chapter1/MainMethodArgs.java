package oca.chapter1;

public class MainMethodArgs {
// What we send to java main method it will take as a string 
	public  static void main(String... args) {
		System.out.println(args[0]+args[1]);
		System.out.println(args[1]);

	}

}

// javac hhhh.java
//java hhhh  1 2 3 4