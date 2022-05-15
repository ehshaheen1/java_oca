package flowcontrol;

public class FalseInfiniteLoop {

	 public static void main(String[] args) {

	        byte counter = 0;

	        // this only looks like an infinite loop,
	        // while in fact it has a definite number of iterations,
	        // depending on the variable type
	        while (counter-- < 10) {
	            continue;
	        }
	        System.out.println("Final value of the counter variable: " + counter + "\n");

	    }

}
