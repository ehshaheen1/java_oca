package arrayVSArrayList;

import java.util.Arrays;

public class UsingBinarySearch {
	
	public static void main(String[] args) {

        Integer [] orderedArrayOfPrimeNumbers = new Integer[] {2, 3, 5, 7, 11, 13, 17, 19};

        // BINARYSEARCH works only if array is previously sorted
        int searchResult1 = Arrays.binarySearch(orderedArrayOfPrimeNumbers, 18);
        System.out.println("Unsorted array search result: " + searchResult1);

        int searchResult2 = Arrays.binarySearch(orderedArrayOfPrimeNumbers, 19);        // despite being ordered, this will not work
        System.out.println("Sorted array search result without sort() method: " + searchResult2);

        Arrays.sort(orderedArrayOfPrimeNumbers);        // Arrays.sort has to be called in order for binarySearch() to work
        int searchResult3 = Arrays.binarySearch(orderedArrayOfPrimeNumbers, 19);
        System.out.println("Sorted array search result: " + searchResult3);     // returns index key
  }
}
