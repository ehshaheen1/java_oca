package exceptions;

public class PrintingException {

	 public static void main(String[] args) {

	        try {
	            method1();
	        } catch (Exception e) {
	            System.out.println(e);      // this will print exception type and message from the constructor
	            //e= new ArrayIndexOutOfBoundsException();
	            e.printStackTrace();        // this will print exteption type, message, and stack trace
	           // System.out.println(e);
	        }

	    }


	    static void method1 () throws Exception {
	        method2();
	    }

	    static void method2() throws Exception {
	        method3();
	    }

	    static void method3 () throws Exception {
	        throw new ArithmeticException("third level exception");
	    }

}
