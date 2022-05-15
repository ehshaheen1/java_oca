package oca.chapter5;

interface I1 {
	public void eatPlants();
}

interface I2 {
	public void eatPlants();

	public void eatMeat();
}
// When multiple interface has a same signature method(all same) it will implement 1 method that will cover all 
public class CheckTwoInterfaceSameMethods implements I1, I2 {
	public void eatMeat() {
		System.out.println("Eating meat");
	}

	public void eatPlants() {
		System.out.println("Eating plants");
	}

	public static void main(String[] args) {
		
		I1 hb= new CheckTwoInterfaceSameMethods();
		I2 om= new CheckTwoInterfaceSameMethods();
		hb.eatPlants();
		om.eatPlants();
	}

}
