package exceptions;

public class JVMvsApplication {

	  // these are the exceptions typical for the JVM
    public static void JVM () throws    IndexOutOfBoundsException,
                                        ArrayIndexOutOfBoundsException,
                                        StringIndexOutOfBoundsException,
                                        ClassCastException,
                                        NullPointerException {

    }

    // these are the exceptions typical for the application
    public  static void application () throws   IllegalArgumentException,
                                                IllegalStateException,
                                                SecurityException {

    }
}
