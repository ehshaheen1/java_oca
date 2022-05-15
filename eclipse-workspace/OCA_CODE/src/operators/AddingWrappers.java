package operators;

public class AddingWrappers {

    public static void main(String[] args) {

        Integer a = 6;
        Double b = 6.0;
        Object c = a + b;
        System.out.println(c);
        System.out.println(((Double) c).intValue());        // output: 12

    }
}