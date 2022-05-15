package oca.chapter4;

public class OrderOfInitialization2 {

	static {
		add(2);
	}

	static void add(int num) {
		System.out.print(num + " ");
	}

	OrderOfInitialization2() {
		add(5);
	}

	static {
		add(4);
	}
	{
		add(6);
	}
	//static {
	//	new OrderOfInitialization2();
	//}
	{
		add(8);
	}

	public static void main(String[] args) {  //2 4 6 8 5 In main method 6 8 5
     System.out.println("In main method");
     new OrderOfInitialization2();
	}
}
