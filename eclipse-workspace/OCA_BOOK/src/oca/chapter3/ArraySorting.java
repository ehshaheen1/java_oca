package oca.chapter3;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);
		for (int i = 0; i < numbers.length; i++)
		System.out.print (numbers[i] + " ");
		
		System.out.println("---------------");
		String[] strings = { "0", "9", "100","200","300","8","Hello","World" };//First 0 looking for it has any zero as a group or not then go 1 then 2 until 9 then Alphabet Strat A
		Arrays.sort(strings);
		for (String string : strings)
		System.out.print(string + " ");
	}

}
