package test3;

public class Decision52Problemetic {

	public static void main(String[] args) {

		int i = 1;//i=2, i=3
		int j = i++; //j=1, j=2
		   //2==2  |      2==2
		if ((i == ++j) | (i++ == j)) { //
			
			i += j;
		}
		System.out.println(i);
		System.out.println(j);
		//System.out.println(null);
		//StringBuilder

	}

}
