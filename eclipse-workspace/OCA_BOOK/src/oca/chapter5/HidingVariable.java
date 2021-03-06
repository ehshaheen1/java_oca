package oca.chapter5;

 class Rodent { //Top level class could be public , default, final and abstract but not private, protected
	
	protected int tailLength = 4;

	public void getRodentDetails() {
		System.out.println("[parentTail=" + tailLength + "]");
	}
}

public class HidingVariable extends Rodent {
	protected int tailLength = 8;

	public void getMouseDetails() { // Prent class method overrides in runtime but not overrides fields/variable. 
		getRodentDetails();    // Here when calling this method hv.getRodentDetails() then it still point to parent class variable cause 
		System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]"); // Variable did not overrides
	}

	public static void main(String[] args) {
		HidingVariable hv = new HidingVariable();
		hv.getRodentDetails();
		hv.getMouseDetails();

	}

}
