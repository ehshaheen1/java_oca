package oca.chapter2;

public class PostPreIncrementPreIncDec {

	public static void main(String[] args) {
		int x = 3;//2
		int y = ++x * 5 / x-- + --x + x-- + --x ; // post increment and pre increment will start from left to right 
		//      4*5/4=5+2=7
		// 4*5/4+2+2=9
		System.out.println("x is " + x);
		System.out.println("y is " + y);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);

	}

}
