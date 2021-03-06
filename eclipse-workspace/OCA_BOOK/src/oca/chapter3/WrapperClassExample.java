package oca.chapter3;

import java.util.ArrayList;
import java.util.List;

public class WrapperClassExample {

	public static void main(String[] args) {
		
		int primitive = Integer.parseInt("123");
		Integer wrapper = Integer.valueOf("123");
		
		//int bad1 = Integer.parseInt("a"); // throws NumberFormatException
		//Integer bad2 = Integer.valueOf("123.45"); // throws NumberFormatException
		
		//Autoboxing
		 List<Double> weights = new ArrayList<>();
		 weights.add(50.5); // [50.5]
		 //weights.add((double)15);
		 weights.add(new Double(60)); // [50.5, 60.0]
		 weights.remove(50.5); // [60.0]
		 double first = weights.get(0); // 60.0
		 
		 List<Integer> heights1 = new ArrayList<>();
		 heights1.add(null);
		 int hh = heights1.get(0);
		 
		 List<String> heights = new ArrayList<>();
		 heights.add(null);
		 heights.add(null);
		// System.out.println(heights);
		 String h = heights.get(0);
		 System.out.println(h); 
		 
		 List<Integer> numbers = new ArrayList<>();
		 numbers.add(1);
		 numbers.add(2);
		 numbers.remove(1);
		 System.out.println(numbers);
		 
		 
		 
		 
		 

	}

}
