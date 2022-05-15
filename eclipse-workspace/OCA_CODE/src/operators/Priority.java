package operators;

public class Priority {

    // comparison has a lower precedence over mathematical operators

    public static void main(String[] args) {

        System.out.println(1 + 2 < 5 - 2);          // output false
        System.out.println((1 + 2) < (5 - 2));      // the same statement with braces
//        System.out.println("" + 1 + 2 < 5 - 2);     // does not compile

    }
}
