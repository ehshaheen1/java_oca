package oca.chapter5;
//Polymorphism Rules
//1. The type of the object determines which properties exist within the object in memory.
//2. The type of the reference to the object determines which methods and variables are accessible to the Java program.
class Primate {
	public boolean hasHair() {
		return true;
	}
}

interface HasTail {
	public boolean isTailStriped();
}

public class PolyphorphismExample extends Primate implements HasTail {
	public boolean isTailStriped() { //Implement interface method
		return false;
	}

	public int age = 10;

	public static void main(String[] args) {
		PolyphorphismExample lemur = new PolyphorphismExample();
		System.out.println(lemur.age); //10
		HasTail hasTail = lemur;
		System.out.println(hasTail.isTailStriped());//false
		Primate primate = lemur;
		System.out.println(primate.hasHair());//true
		
		//Example2
		HasTail hasTail1 = lemur;//Parent reference cant access child class instance variable cause ploymorphism applied for method
		System.out.println(((PolyphorphismExample)hasTail1).age); // We can access when we down casted it
		
		Primate primate1 = lemur;
		System.out.println(((PolyphorphismExample)primate1).isTailStriped());
		// A b =(C)d
		//Type of d  and C must have a relation either parent to child or vice versa
		//C must have either same type or derived type of A
		//Underlying original object type of d must be either same or derived type of C
		
		//Example3
		Primate primate2 = lemur;//1. Casting an object from a subclass to a superclass doesn?t require an explicit cast.
		//PolyphorphismExample lemur2 =  primate2; // DOES NOT COMPILE// 2. Casting an object from a superclass to a subclass requires an explicit cast.
		PolyphorphismExample lemur3 = (PolyphorphismExample)primate2;
		System.out.println(lemur3.age);
		
		Primate primate4= new Primate();
		PolyphorphismExample pex= (PolyphorphismExample)primate4;
		
		
		
	}
}
