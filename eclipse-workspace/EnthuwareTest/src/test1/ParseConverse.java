package test1;

public class ParseConverse {

	public static void main(String[] args) {
		String mStr = "123"; 
		long m = new Long(mStr);
		long m1 = Long.parseLong(mStr);
		//long m2 = Long.longValue(mStr);
		long m3 = (new Long(mStr)).parseLong(mStr);
		//System.out.println(m3);
		long m4 = Long.valueOf(mStr).longValue();
		

      int j, k;
    int  i = j = k = 9; //chaining initialization is possible only if all the variable are declared first
      System.out.println(i);
   }

	
	}


