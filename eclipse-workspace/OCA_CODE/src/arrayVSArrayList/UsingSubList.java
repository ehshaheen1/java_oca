package arrayVSArrayList;

import java.util.ArrayList;
import java.util.List;

public class UsingSubList {

	// sublist() from arraylist demonstration

    public static void main(String[] args) {

        List wildAnimals = new ArrayList();
        wildAnimals.add("Lion");
        wildAnimals.add("Tiger");
        wildAnimals.add("Kangaroo");
        wildAnimals.add(1, "Whale");

        List domesticAnimals = new ArrayList();
        domesticAnimals.add("Cat");
        domesticAnimals.add("Dog");
        domesticAnimals.add(1, "Parrot");

        List animalsISaw = new ArrayList();
        animalsISaw.addAll(domesticAnimals);
        System.out.println(animalsISaw);
        animalsISaw.add(wildAnimals.subList(0,1));

        System.out.println(animalsISaw);

    }
}
