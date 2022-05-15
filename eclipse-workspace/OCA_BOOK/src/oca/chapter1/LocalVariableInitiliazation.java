package oca.chapter1;

public class LocalVariableInitiliazation {

	public static void main(String[] args) {
		eatMore(false,-1);
	}
	
	public static void eatMore(boolean hungry, int amountOfFood) { // Method parameter undefined can be used/access so there will be no compile error
		 int roomInBelly = 5; //we can get compile time error if variable used inside block but uninitialized
		 if (hungry) {
		 boolean timeToEat = true;
		 while (amountOfFood > 0) {
		 int amountEaten = 2;
		
		 roomInBelly = roomInBelly - amountEaten;
		 amountOfFood = amountOfFood - amountEaten;
		}
		 }
		 System.out.println(amountOfFood);
		 }
	
	public int ops()
	{
		int y = 10; //Local variable need to be initialized before use
		 int x;
		// int reply = x + y; // DOES NOT COMPILE
		 return 1;
	}
	
	 public void eatIfHungry(boolean hungry) {
		 if (hungry) {
		 int bitesOfCheese = 1;
		
		} // bitesOfCheese goes out of scope here
		// System.out.println(bitesOfCheese);// DOES NOT COMPILE
		 }
	
	public void findAnswer(boolean check) {
		int answer;
		int onlyOneBranch;
		if (check) {   //Parameterized are considered local variable and have to be initialized before use
		onlyOneBranch = 1; 
		answer = 1;
		
	}  else { 
		answer = 2;
		//onlyOneBranch = 2; 
		}
		 
		System.out.println(answer);
	   // System.out.println(onlyOneBranch); // DOES NOT COMPILE
		
		}

}
