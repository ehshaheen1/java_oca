package oca.chapter6;

public class ThrowException {

	public static void main(String[] args) throws Exception { /*
		//throw new RuntimeException(); //unreachable code
		try {
			System.out.println(args[0]);
			//throw new RuntimeException();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage()+ "Catch block");
			System.exit(0);
			throw new RuntimeException();
		} finally {
			System.out.println("Finally block");
			throw new Exception();
		}*/
	System.out.println(exceptions());
	} 
	
	public static String exceptions() {
		String result = "";
		String v = null;
		try {
			try {
				result += "before";
				v.length();
				result += "after";
			} catch (NullPointerException e) {
				result += "catch";
				throw new RuntimeException("Catchhhh");// We can skip runtime exception
			} finally {
				result += "finally";
				throw new Exception();
			}
		} catch (Exception e) {
			result += "done";
		}
		return result;
	}

}
