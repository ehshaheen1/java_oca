package flowcontrol;

public class FlowOfConstructor {

	 // extended and extending classes must have matching constructors,
    // or direct execution flow in that way that base class constructor gets executed.
    // ultimately, every class descends form the Object.class, the ultimate parent.
    // in this example there is only one

    public static void main(String[] args) {
        Antenna empireStateBuildingAntenna = new Antenna();
    }


    public FlowOfConstructor(){
        System.out.println("Foundation constructor is executed first.");
    }

}


class Skyscraper extends FlowOfConstructor {

    Skyscraper() {
            System.out.println("Skyscraper constructor is executed second.");
        }
    }

class Antenna extends Skyscraper {

    Antenna() {
        System.out.println("Antenna constructor is executed third.");
    }
}
