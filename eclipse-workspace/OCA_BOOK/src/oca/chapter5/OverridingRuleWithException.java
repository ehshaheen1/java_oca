package oca.chapter5;

class InsufficientDataException extends Exception {
}

class Reptile {
	protected double getHeight() throws InsufficientDataException {
		return 2;
	}

	protected Number getLength() {
		return 10;
	}
	private String getNumberOfHumps() {
		return "Undefined";
		}
	
}

public class OverridingRuleWithException extends Reptile {
	//protected double getHeight() throws Exception { // DOES NOT COMPILE
	//	return 2;
	//}

	protected Double getLength() throws IllegalArgumentException {
		return 10.0;
	}
	private int getNumberOfHumps() {
		return 10;
		}

	public static void main(String[] args) {
		Reptile rep= new OverridingRuleWithException();
		System.out.println(((OverridingRuleWithException)rep).getNumberOfHumps());
		

	}
	

}
