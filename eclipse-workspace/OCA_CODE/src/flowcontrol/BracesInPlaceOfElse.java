package flowcontrol;

public class BracesInPlaceOfElse {

	// this is deceiving if-else statement, since there is no else keyword.
    // any statement can be enclosed with braces, and it does not violate java syntax.

    public static void main(String[] args) {

        boolean electricity = false;

        if (electricity) {
            System.out.println("watch out!");
        } {
            System.out.println("not dangerous");
        }

    }
}
