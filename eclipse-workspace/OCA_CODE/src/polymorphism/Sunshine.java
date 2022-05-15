package polymorphism;

class Sun {
    public void getColor () {
        System.out.println("Sun color - SUPER");
    }
    public void getDistance() {
        System.out.println("fa fa awa - SUPER");
    }
}

public class Sunshine extends Sun{

    public void getColor () {
        System.out.println("Sunshine color - SUB");
    }


    public static void main(String[] args) {

        Sun a = new Sun();
        a.getColor();

        Sun b = new Sunshine();
        b.getColor();               // overridden methods are called seemingly >in spite< of reference type
        b.getDistance();


    }

}