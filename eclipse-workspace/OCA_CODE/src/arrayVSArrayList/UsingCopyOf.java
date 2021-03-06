package arrayVSArrayList;

import java.util.Arrays;

public class UsingCopyOf {

	 // Arrays.copyOf will copy elements from one array to the other

    public static void main(String[] args) {

        int fibonacciSequence [] = new int[]{0,1,1,2,3,5,8,13};
        // It will copy first four elements (0,1,1,2)
        int fibonacciSequenceCopy[] = Arrays.copyOf(fibonacciSequence,4);

        for (int element : fibonacciSequenceCopy)
            System.out.print(" "+element+" ");
        System.out.println();


        // this will copy only first three elements (0,1,1)
        int fibonacciSequenceCopy2 [] = Arrays.copyOf(fibonacciSequence, 3);

        for (int element : fibonacciSequenceCopy2)
        	   System.out.print(" "+element+" ");


	}

}
