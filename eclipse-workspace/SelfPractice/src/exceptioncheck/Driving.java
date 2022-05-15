package exceptioncheck;

import java.io.IOException;

public class Driving {

	 // if there is no condition that might produces anticipated exception,
    // the catch part will disable compilation.

    public static void main(String[] args) {

        try {

            try {
                throw new NumberFormatException();
            } catch (ArithmeticException e) {
                System.out.println("Format is wrong!");
            }
        }                       // without this closing parenthesis, second catch would become part of the inner try statement,
                                // depriving outer try of a mandatory catch part, and rendering it uncompilable
        catch (Exception e) {
            System.out.println("Generic message");
        }

        }

     // }

}