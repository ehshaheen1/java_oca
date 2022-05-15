package basics;

public class UsingKeyword {

	// method can not be called 'do()', because 'do' is one of the java keywords

    public static void main(String[] args) {

        doIt();

        done();

      //  do();

    }

    static void doIt () {
        System.out.println("Doing it.");
    }

    static void done () {
        System.out.println("Done");
    }

	/*
	 * static void do () { System.out.println("Doing"); }
	 */
}
