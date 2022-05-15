package oca.chapter5;

 interface X1 {
	public int eatPlants(int quantity);
}

 interface X2 {
	public void eatPlants();
}

public class InterfaceOverloadingMethodTest implements X1, X2 {
	
	public int eatPlants(int quantity) {
		System.out.println("Eating plants: " + quantity);
		return quantity;
	}
	
	public void eatPlants() {
		System.out.println("Eating plants");
	}

	public static void main(String[] args) {
		
		
      
	}

}
