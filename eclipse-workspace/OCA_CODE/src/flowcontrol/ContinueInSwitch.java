package flowcontrol;

public class ContinueInSwitch {

	 // continue statement can not be in a switch statement

    public static void main(String[] args) {

        String consuming = "Internet";

        switch (consuming) {
            case "Radio":       System.out.println("Radio");
            case "TV":          System.out.println("TV");
//            case "Internet":    System.out.println("Internet"); continue;       // does not compile
            case "Books":       LIBRARY:
            {
                System.out.println("Books");
//                continue LIBRARY;               // does not compile
            }
        }
    }
}
