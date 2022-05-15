package oca.chapter2;

public class NestedLoop {

	public static void main(String[] args) {

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };

		for (int[] mySimpleArray : myComplexArray) { // here myComplexArray assign type int[] because it reads from
														// inside array
			for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}

	}

}
