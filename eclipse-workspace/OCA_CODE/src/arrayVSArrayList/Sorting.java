package arrayVSArrayList;

import java.util.Arrays;

public class Sorting {

	public static void main(String[] args) {
		 int [] shuffled = new int[] {1945, 1914, 1990, 1918, 1941};

	        // this will sort array in ascending order
	        Arrays.sort(shuffled);
	        for (int element : shuffled)
	            System.out.print(" "+element);
	            System.out.println();

	        // this will return the index of searched value
	        System.out.println(Arrays.binarySearch(shuffled, 1990));     //returns index 4


	        // sort method can not be called on a multidimensional arrays
	        int [] [] [] datesYearMonthDay = {{ {1914}, {3}, {29}},
	                                            {{1958}, {4},{25}},
	                                            {{2010}, {2}, {19}}};

//	        Arrays.sort(datesYearMonthDay);             // compiles fine, but throws ClassCastException at run time

	}

}
