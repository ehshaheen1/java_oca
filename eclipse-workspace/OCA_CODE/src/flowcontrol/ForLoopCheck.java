package flowcontrol;

public class ForLoopCheck {

	// in case an exit condition in a for loop returns false even before the loop has started,
    // body of the for loop will not be executed even once.

    public static void main(String[] args) {

        int targetYear = 2017;

        for (; targetYear > 2035; ) {
            System.out.println(targetYear);
            targetYear++;
        }

        System.out.println(targetYear);

    }
}
