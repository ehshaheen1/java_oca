package oca.chapter3;

public class SubstringTest {

	public static void main(String[] args) {
		String string = "animals";
		System.out.println(string.substring(3)); // mals
		System.out.println(string.substring(string.indexOf('m'))); // mals
		System.out.println(string.substring(3, 4)); // m
		System.out.println(string.substring(3, 7)); // mals
		
		System.out.println(string.substring(3, 3)); // empty string // becase start 3 end end 2(3-1)
		System.out.println(string.substring(3, 2)); // throws exception
		System.out.println(string.substring(3, 8)); // throws exception

	}

}
