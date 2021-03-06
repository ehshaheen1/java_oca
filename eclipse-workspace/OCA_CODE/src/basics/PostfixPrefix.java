package basics;

public class PostfixPrefix {
    static int a, b = 7, c = a+b;               // weird but valid

 
	// difference between postfix and prefix

    public static void main (String[] args) {
    	   System.out.println(a);      // output: 7
        int numberOfSamurai = 7;

        // incrementation
        System.out.println(++numberOfSamurai);      // output 8, numberOfSamurai = 8
        System.out.println(numberOfSamurai++);      // output 8, numberOfSamurai = 9
        System.out.println(numberOfSamurai);        // output 9

        // decrementation
        System.out.println(--numberOfSamurai);      // output 8, numberOfSamurai = 8
        System.out.println(numberOfSamurai--);      // output 8, numberOfSamurai = 7
        System.out.println(numberOfSamurai);        // output 7


        int a = numberOfSamurai++;
        System.out.println("a: " + a + ", samurai: " + numberOfSamurai);    // output 7, 8

        a = ++numberOfSamurai;
        System.out.println("a: " + a + ", samurai: " + numberOfSamurai);    // output 9, 9

        a = numberOfSamurai--;
        System.out.println("a: " + a + ", samurai: " + numberOfSamurai);    // output 9, 8

        a = --numberOfSamurai;
        System.out.println("a: " + a + ", samurai: " + numberOfSamurai);    // output 7, 7
        
        
    
    }
}
