package flowcontrol;

public class BunchOfCase {


    // case block in a switch statement can be empty.
    // compiler allows to create a sequence of options that will produce identical result,
    // even when there is no code to execute at the end, like with the egyptian cities

    public static void main(String[] args) {

        String travelingToCity = "Washinton";

        switch (travelingToCity) {
            case "Tokyo":
                System.out.println("Going to Japan");
            case "New York":    case "Washinton":   case "Los Angeles": case "Detroit":         // weird, but valid
                System.out.println("Going to USA.");                                            // missing break statement will cause 'falling through' effect
            case "Sydeny":  case "Melbourne":   case "Canberra":                                // weird, but valid
                System.out.println("Going to Australia  ");
            case "Cairo":case "Alexandria":case "Giza":                                         // weird, but valid
        }
    }
}
