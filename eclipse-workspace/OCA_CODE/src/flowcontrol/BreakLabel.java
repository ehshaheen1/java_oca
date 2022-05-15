package flowcontrol;

public class BreakLabel {

	// labeled break statement does not have to be in a while, do, for or switch statement
    // to use a labeled break statement it is enough to label a block of code.

    public static void main(String[] args) {

        int i = 3;

        BAD: {
            System.out.println("Starting BAD...");
            i++;
            if (i == 4) break BAD;
            System.out.println("unreachable");
        }

        System.out.println("Bad has been broken!");

    }
}
