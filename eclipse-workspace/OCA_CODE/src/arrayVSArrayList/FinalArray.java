package arrayVSArrayList;

public class FinalArray {
	  public static void main(String[] args) {

	        // although array object might be final, its elements still can be altered without any exceptions

	        final String [] typesOfSchizophrenia = new String[]{"Paranoid", "Catatonic", "Disorganised", "Undifferentiated", "Residual"  };

	        typesOfSchizophrenia[4] = "empty";

	        for (String type : typesOfSchizophrenia)
	            System.out.println(type);
 }
}
