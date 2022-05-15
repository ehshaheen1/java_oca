package oca.chapter2;

public class DoWhile {

	public static void main(String[] args) {
	    int y =20;
		while(y > 10) {
			
			System.out.println(y--);
			}
		int x = 0;
		do {
			//int y=5;
		x++;
		} while(false); // while(y<10) // It will compile time error because variable is out of scope. It defined and initialized in do block
		System.out.println(x);// Do-while we can use false in direct
		
		//while(true) { // We cant use false value in while loop. It will give you unreachable code as a compiler error
		//	System.out.println("Enadul");
		//}
		
	

	}

}
