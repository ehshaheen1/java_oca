package operators;

public class Confusing {

    public static void main(String[] args) {

        byte a = -2;
        byte b = a--;       // b becomes -2, a becomes -3
        byte c = ++b;       // b becomes -1, c becomes -1

        System.out.println("a: " + a);
        System.out.println("b: " + b);
        System.out.println("c: " + c);

    }
}
