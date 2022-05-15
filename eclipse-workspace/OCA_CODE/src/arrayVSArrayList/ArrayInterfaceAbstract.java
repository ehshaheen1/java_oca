package arrayVSArrayList;

public class ArrayInterfaceAbstract {

	public static void main(String[] args) {
    
		// array can be made out of interfaces and abstract classes
        Car[] someCars = new Car[]{};
        Yacht[][][]someBoats = new Yacht[][][]{};
        Bicycle[] someBicycles = new Bicycle[]{};
        Motorbike[][] someMotorbikes = new Motorbike[][]{};

    }
}

interface Car {
    void driving();
}

interface Yacht {
    void sailing ();
}

abstract class Bicycle{
    void peddaling(){}
}

abstract class Motorbike {
    void riding(){}
}

