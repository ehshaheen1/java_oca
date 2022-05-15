package method;
//This example is based on what need to be handle in order to exception
 class Monkey {

    public void eating () throws Exception {
        System.out.println("raw food");
    }

}
 class Human extends Monkey {

    public void eating () {
        System.out.println("cooked food");
    }

}
public class DifferenceInException {

    public static void main(String[] args) {

        Human nietzsche = new Human();

        nietzsche.eating();     // compiles fine, no exception handling needed



        Monkey bobo = new Human();
        Monkey bubu = new Monkey();

//        bobo.eating();      // does not compile, missing exception handling
//        bubu.eating();      // does not compile, missing exception handling

    }

}
