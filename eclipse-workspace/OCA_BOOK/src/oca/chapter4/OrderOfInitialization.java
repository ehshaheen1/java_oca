package oca.chapter4;

public class OrderOfInitialization {
	private String name = "Torchie";
	{
		System.out.println(name);
	}
	private static int COUNT = 0;
	static {
		System.out.println(COUNT);  //Output// 0 10 Torchie constructor
	}
	static {
		COUNT += 10;
		System.out.println(COUNT);
	}

	public OrderOfInitialization() {
		System.out.println("constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("inside main");
		//OrderOfInitialization ofi= new OrderOfInitialization();
	}
}
