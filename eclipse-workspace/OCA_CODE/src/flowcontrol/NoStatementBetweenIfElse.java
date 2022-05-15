package flowcontrol;

public class NoStatementBetweenIfElse {

	 public static void main(String[] args) {

	        // there can not be any statements between the if and matching else block;
	        int numberOfSquares = 3;
	        System.out.println("Do you have a Square to spare?");


	        if (numberOfSquares < 4) {
	            System.out.println("I'm sorry, I don't have a Square to spare!");
	        }
//	        System.out.println("I'll take one measly ply!");        // does not compile
	        else {
	            System.out.println("Here you go!");
	        }

	    }
	}
