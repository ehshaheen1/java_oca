package oca.chapter5;

interface P1 {
	public int eatPlants();
}

interface P2 {
	public void eatPlants();
}
// A class cant have two method as same name and parameter
public class OverridingMethodDiffReturnType /*implements P1, P2 */{
	//public int eatPlants() { // DOES NOT COMPILE
	//	System.out.println("Eating plants: 10");
	//	return 10;
	//}

	//public void eatPlants() { // DOES NOT COMPILE
	//	System.out.println("Eating plants");
	//}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
