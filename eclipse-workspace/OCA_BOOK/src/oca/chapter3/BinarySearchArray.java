package oca.chapter3;

import java.util.Arrays;

public class BinarySearchArray {

	public static void main(String[] args) {
		//Binary search have to be sorted array // If not found then it will calculate like -index-1
	     int[] numbers = {2,4,6,8};
		 System.out.println(Arrays.binarySearch(numbers, 2)); // 0
		 System.out.println(Arrays.binarySearch(numbers, 4)); // 1
		 System.out.println(Arrays.binarySearch(numbers, 1)); // -1   //It will sit right before 2 where index is 0 (-0-1=1)
		 System.out.println(Arrays.binarySearch(numbers, 3)); // -2
		 System.out.println(Arrays.binarySearch(numbers, 9)); // -5
		 System.out.println(Arrays.binarySearch(numbers, 7)); // -4 => 7 Will sit on right before 8 which is -3-1
		 System.out.println(Arrays.binarySearch(numbers, 5)); // -3 => 5 Will sit on right before 6 which is -2-1

	}

}
