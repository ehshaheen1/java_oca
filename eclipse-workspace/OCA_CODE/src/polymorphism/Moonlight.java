package polymorphism;
//Example of how to get call for variable and method in polymorphism
class Moon {
    public int shine = 3;
    public int getShine () {
        System.out.println("Moon " + shine);
    return shine;
    }
}

public class Moonlight extends Moon{

    public int shine = 55;
    public int getShine () {
        System.out.println("Moonlight " + shine);
        return shine;
    }

    public static void main(String[] args) {

        Moon b = new Moonlight();//3 55
        System.out.println(b.shine + " " + b.getShine());

        Moonlight bb = (Moonlight) b; //55 55
        System.out.println(bb.shine + " " + bb.getShine());

    }

}