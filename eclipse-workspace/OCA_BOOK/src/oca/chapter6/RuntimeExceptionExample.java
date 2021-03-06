package oca.chapter6;

public class RuntimeExceptionExample {

	public static void main(String[] args) {
		RuntimeExceptionExample rex= new RuntimeExceptionExample();
		rex.explore();
	}

	public void explore() {
		try {  // Try will follow either catch or final // Try must have be present braces. It will not work like if condition
			fall();
			System.out.println("never get here");  //Get up // see animal
		} catch (RuntimeException e) { //If catch block has exception then it will not executed further
			getUp();
		}
		seeAnimals();
	}

	private void seeAnimals() {
		System.out.println("See animal");

	}

	private void getUp() {
		System.out.println("get up");

	}

	public void fall() {
		throw new RuntimeException();
	}
}
