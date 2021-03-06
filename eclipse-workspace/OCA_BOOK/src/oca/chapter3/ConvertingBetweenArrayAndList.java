package oca.chapter3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ConvertingBetweenArrayAndList {

	public static void main(String[] args) {
		//ArrayList to array
		List<String> list = new ArrayList<>();
		list.add("hawk");
		list.add("robin");
		Object[] objectArray = list.toArray();
		objectArray[1]=12;
		System.out.println(list);
		for (Object object : objectArray) {
			System.out.print(object+" ");
		}
		System.out.println(objectArray.length); // 2
		String[] stringArray = list.toArray(new String[5]);
		for (String string : stringArray) {
			System.out.println(string);	
		}
		
		System.out.println(stringArray.length); // 2
		//----------------
		//Array to arraylist // When we convert array to asList then size have to be fixed. You can modified the element but cant modified the size list and array
		//Add remove not possible only modified
		//If modified one placed then other place also be updated 
		String[] array = { "hawk", "robin" }; // [hawk, robin]
		 List<String> list1 = Arrays.asList(array); // returns fixed size list
		 System.out.println(list1.size()); // 2
		list1.set(1, "test"); // [hawk, test]
		
		//list1.add("Test3");
		 array[0] = "new"; // [new, test]
		 System.out.println(list1);
		 for (String b : array) System.out.print(b + " "); // new test
		 list1.remove(1); // throws UnsupportedOperation Exception

	}

}
