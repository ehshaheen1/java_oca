package codingcheck1;

public class Test1 {
	public static void main(String[] args) {

		String s="ops";
		String s1= "ops".trim();
		
		System.out.println(s==s1);
		
	 /*String settings = null;
	    if (false) {      // OK
	      System.out.println("Camera:" + settings);
	    } */
	  /*  while (false) {     // error: unreachable statement
	      settings = "Adjust settings manually";
	    }
	    for (; false ; ) {  // error: unreachable statement
	    }
	    System.out.println("Camera:" + settings); */
	  }
  }
