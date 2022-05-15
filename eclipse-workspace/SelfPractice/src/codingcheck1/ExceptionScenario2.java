package codingcheck1;

public class ExceptionScenario2 {
	 StringBuilder getStringBuilder() {
		    StringBuilder returnVal = new StringBuilder("10");
		    try {
		      String[] students = {"harry", "paul"};
		      System.out.println(students[5]);
		    } catch (Exception e) {
		      System.out.println("About to return: " + returnVal);
		      return returnVal;
		    } finally {
		      returnVal.append("10");  // It will modify return value
		      System.out.println("Return value is now: " + returnVal);
		    }
		    return returnVal;
		  }
	 

	  String getString() {
	    String returnVal = new String("10");
	    try {
	      String[] students = {"harry", "paul"};
	      System.out.println(students[5]);
	    } catch (Exception e) {
	      System.out.println("About to return: " + returnVal);
	      return returnVal; // reference is copied as return value
	    } finally {
	      returnVal += "10";  // It won't modify return value,
	                          // because String is immutable
	      System.out.println("Return value is now: " + returnVal);
	    }
	    return returnVal;
	  }
	
	int getInt() {
	    try {
	      String[] students = {"harry", "paul"};
	      System.out.println(students[5]);
	    } catch (Exception e) {
	      return 10;
	    } finally {
	      return 20;  
	    }
	  }
	
	int modifiedInt() {
	    int returnVal = 10;
	    try {
	      String[] students = {"harry", "paul"};
	      System.out.println(students[5]);
	    } catch (Exception e) {
	      System.out.println("About to return: " + returnVal);
	      return returnVal;
	    } finally {
	      returnVal += 10;  
	      System.out.println("Return value is now: " + returnVal);
	    }
	    return returnVal;
	  }
	 public static void main(String[] args) {
		    ExceptionScenario2 var = new ExceptionScenario2();
		    System.out.println(var.getInt()); // 
		    System.out.println("In main: " + var.modifiedInt()); 
		    System.out.println("In main: " + var.getStringBuilder()); 
		    System.out.println("In main: " + var.getString()); 
		  }
}
