package flowcontrol;

public class ReturnInTry {

	// despite the return statement in try block,
    // finally block is executed

    public static void main(String[] args) {

        travelToMars(false);

    }

    static void  travelToMars (boolean launch) {
        try {
            if (launch == false)
                return;
        } catch (Exception e) {
            System.out.println("exception");
        } finally {
            System.out.println("the end");
        }
    }
}
