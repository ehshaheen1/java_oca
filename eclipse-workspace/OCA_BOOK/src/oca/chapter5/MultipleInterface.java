package oca.chapter5;

interface Herbivore {
	
	default public void eatPlants() {System.out.println("Interface default");};
}

interface Omnivore {
	
//	public void eatPlants();

	public void eatMeat();
}

public class MultipleInterface implements Herbivore, Omnivore {
	
	public void eatMeat() {
		System.out.println("Eating meat");
	}

	//public void eatPlants() {
	//	System.out.println("Eating plants");
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInterface m= new MultipleInterface(); // When we implement any interface then default method comes automatically.
		m.eatPlants();// We can even call default method even in child class reference

	}

}
