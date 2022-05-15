package polymorphism;

 class Wolf {

    public Wolf () {
        System.out.println("...wolf constructor");
        barking();          // this will call barking from the Dog class, when called from the Dog object
    }

    public void barking () {
        System.out.println("Wolf bark!");
    }

}
public class Dog extends Wolf{

    public void barking () {
        System.out.println("Dog bark!");
    }


    public static void main(String[] args) {

        Dog megan = new Dog();
        megan.barking();

        Wolf alpha = new Wolf();
        alpha.barking();

        Wolf omega = new Dog();
        omega.barking();

    }

}
