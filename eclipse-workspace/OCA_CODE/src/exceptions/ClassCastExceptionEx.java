package exceptions;

public class ClassCastExceptionEx {

	 // this will compile, but throw java.lang.ClassCastException at runtime

    public static void main(String[] args) {
        // In runtime getObject type must be same type like Object or derived type of String Ex (String parent)
       // String s = (String) getObject();
    	
    	 Object s = (Object) getObject();
    	 //System.out.println(s);

    }

	/*
	 * static Object getObject () { return new Object(); }
	 */
    static String getObject ()
    { 
    	return new String("OPsw"); 
    }
}
