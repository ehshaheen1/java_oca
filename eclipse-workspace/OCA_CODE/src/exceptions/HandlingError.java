package exceptions;

public class HandlingError {

	// since Error classes do not extend from java.lang.Exception,
    // they can not be caught with a try-catch statement.
    // this code will simply cause a main method to throw an InternalError.

    public static void main(String[] args) {

        try {
            startProducingEnergy();
        } catch (Exception e) {
            System.out.println("Can not produce energy.");
        }

    }

    public static void startProducingEnergy () throws Exception{
        throw new InternalError();
    }

}
