package basics;

public class Rounding {
	public static void main(String[] args) {

    // decimal numbers that end in 0.5 are rounded to the next larger integer
    System.out.println(Math.round(23.51));
    System.out.println(Math.round(17.5));
    System.out.println(Math.round(0.5));
    System.out.println(Math.round(-0.5));
    System.out.println(Math.round(-4.3));
    System.out.println(Math.round(-4.5));
    System.out.println(Math.round(-4.51));
    
	}
}
