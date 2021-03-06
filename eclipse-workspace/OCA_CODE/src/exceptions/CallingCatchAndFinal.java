package exceptions;

public class CallingCatchAndFinal {

	  // calling method that throws checked exceptions
    // from catch or finally block
    // will cause a compile-time error.

    public static void main(String[] args) {

    	CallingCatchAndFinal groceriesShopping = new CallingCatchAndFinal();

        try {
            groceriesShopping.enterPIN();
        } catch (Exception e) {
        	  System.out.println("---------8");
//            groceriesShopping.enterPIN();                   // does not compile
            groceriesShopping.checkAvailableAmount();
          

        } finally {
//            groceriesShopping.enterPIN(); 
        	System.out.println("---------9");// does not compile
            groceriesShopping.checkAvailableAmount();
            
        }
    }


    public void enterPIN () throws Exception {
        throw new Exception();
    }

    public void checkAvailableAmount() throws RuntimeException {
        throw  new RuntimeException();
    }
}
