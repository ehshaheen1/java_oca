package oca.chapter4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

 public class LambdaExpression {
	private String species;
	private boolean canHop;
	private boolean canSwim;

	public LambdaExpression(String speciesName, boolean hopper, boolean swimmer) {
		species = speciesName;
		canHop = hopper;
		canSwim = swimmer;
	}

	public boolean canHop() {
		return canHop;
	}

	public boolean canSwim() {
		return canSwim;
	}

	public String toString() {
		return species;
	}
	

	public static void main(String[] args) {
		 List<LambdaExpression> animals = new ArrayList<LambdaExpression>(); // list of animals
		 animals.add(new LambdaExpression("fish", false, true));
		 animals.add(new LambdaExpression("kangaroo", true, false));
		 animals.add(new LambdaExpression("rabbit", true, false));
		 animals.add(new LambdaExpression("turtle", false, true));
		
		// print(animals, new CheckIfHopper()); // pass class that does check
		// print(animals, lb-> lb.canSwim());
		 print(animals, lb-> lb.canSwim()); //  ->1
	 }
		 //private static void print(List<LambdaExpression> animals, CheckTrait checker) {
	    private static void print(List<LambdaExpression> animals, Predicate<LambdaExpression> checker) {
		 for (LambdaExpression animal : animals) {
		 if (checker.test(animal)) // the general check // Now it will call to ->1
		 System.out.print(animal + " ");
		 }
		 System.out.println();
	}

}

/*interface CheckTrait{
	public boolean test(LambdaExpression lex);
} */
