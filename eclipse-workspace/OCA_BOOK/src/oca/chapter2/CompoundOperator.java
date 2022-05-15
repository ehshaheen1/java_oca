package oca.chapter2;

public class CompoundOperator {

	public static void main(String[] args) {
		//long x = 10;
		//int y = 5;
		//y = y * x; // DOES NOT COMPILE
		// but it will okay (int)(y * x);
		
		long x = 10;
		int y = 5;
		y *= x; //Compound operator(*=,/= etc) cast automatically
		
		A a = new A();
		B b = new B();
		
		if(b instanceof B) { // reference b type B, must have to be instanceOf same B type or parent of B type which A is Parent class
			System.out.println("opsssss");
		}
		else
		{
			System.out.println("Else");
		}

	}

}

class A{}
class B extends A{}
class C extends A{}
