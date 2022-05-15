package operators;

public class Confusing2 {

    public static void main(String[] args) {

        int f1 = 5;  //6 5
        int f2 = f1++; //5  4 3 4 3
        int f3 = --f2; // 4 5
		
		//  System.out.println("f11: " + f1); 
        //  System.out.println("f22: " + f2);
		//  System.out.println("f33: " + f3);
		  
		 // System.out.println("--f1: " + --f1); 
		//  System.out.println("f2--: " +f2--);
		 // System.out.println("++f3: " + ++f3);
		  //System.out.println("++f2: " + ++f2);
		   // 5==4             5 !=4
        if ((--f1 == f2--) | (++f3 != ++f2 )) // this is a real-life example
            f3 += f2--;                                 // that real programmers encounter on a daily basis
            //5+4

        System.out.println("f1: " + f1);
        System.out.println("f2: " + f2);
        System.out.println("f3: " + f3);


    }

}
