package polymorphism;


 class T800 {

    public static void findJohnConnor () {
        System.out.println("T-800 ... searching for John Connor...");
    }

}
public class StaticPrivateCantInherit extends T800{

	// static and private methods are never inherited, and
    // therefore, do not succumb to the rules of polymorphism

    public static void main(String[] args) {

        T800 terminator1 = new T800();
        T800 terminator2 = new StaticPrivateCantInherit();
        StaticPrivateCantInherit terminator3 = new StaticPrivateCantInherit();

        terminator1.findJohnConnor();
        terminator2.findJohnConnor();       // if method was not static, invoked method would be from the object type: T-1000
        terminator3.findJohnConnor();

    }

    public static void findJohnConnor () {
        System.out.println("T-1000 ... searching for John Connor...");
    }
}

