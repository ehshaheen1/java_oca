package polymorphism;


 class Summer{

    void goingToTheBeach () {
        System.out.println("going to the beach in the summer");
    }

}
public class August extends Summer{

    // reference type determines what methods can be called on the instance,
    // while polymorphism states that overridden methods
    // should be called in accordance with object type

    public static void main(String[] args) {

        August year2016 = new August();
        year2016.goingToTheBeach();
        year2016.swimming();

        Summer year2017 = new August();
        year2017.goingToTheBeach();
//        year2017.swimming();            // does not compile

        Summer year2018 = new Summer();
        year2018.goingToTheBeach();
//        year2018.swimming();            // does not compile
    }


    void goingToTheBeach () {
        System.out.println("going to the beach in August");
    }

    void swimming () {
        System.out.println("swimming");
    }
}
