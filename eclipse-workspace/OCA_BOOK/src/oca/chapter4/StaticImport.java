package oca.chapter4;
//import static is format. You cant change it
//import java.util.Arrays;
//import java.util.List;
//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE
//Static import are import static member like static variable and method
public class StaticImport {

	public static void main(String[] args) {
		
		//List<String> list = asList("one", "two");
		
		asList("one");

	}

}
