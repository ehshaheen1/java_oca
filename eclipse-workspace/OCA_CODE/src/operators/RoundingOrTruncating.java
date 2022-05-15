package operators;

public class RoundingOrTruncating {

    public static void main(String[] args) {

        int a = 13 / 10;        System.out.println(a);      // output 1
//        int b = 13 / 10.0;                                // does not compile
//        int c = 13.0 / 10;                                // does not compile
        double d = 13 / 10.0;   System.out.println(d);      // output 1.3

        System.out.println(15 / 10);                        // output 1
        System.out.println(15 / 10.0);                      // output 1.5
        System.out.println(15.0 / 10);                      // output 1.5

    }
}