package oca.chapter3;

public class MultidimentionalArray {

	public static void main(String[] args) {
		
		int[][] vars1; // 2D array
		int vars2 [][]; // 2D array
		int[] vars3[]; // 2D array
		int[] vars4 [], space [][]; // a 2D AND a 3D array
		
		//String [][] rectangle = new String[3][2];  //0 0
													 //0 0
													 //0 0
		
		System.out.println("-----------------------");
		
		int[][] twoD = new int[3][2];               // 0 1 2
													//0 1  0 1 0 1
		for (int i = 0; i < twoD.length; i++) {
		for (int j = 0; j < twoD[i].length; j++)
		System.out.print(twoD[i][j] + " "); // print element
		System.out.println(); // time for a new row
		}
	}

}
