package oca.chapter1;

public class GarbageCollector {
	//The object no longer has any references pointing to it.
	//All references to the object have gone out of scope.
public static void main(String[] args) { 
	 String one, two;
	 one = new String("a");
	 two = new String("b");
	 one = two;   // Here first garbage collector happen in line no 10 because object a does not have reference
	 String three = one;
	 one = null;
} //After line 13 it gonna be out of scope
}
