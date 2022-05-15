package basics;

public class Length {


    public static void main(String[] args) {

        // if run without any arguments, this will output zero.
        // it will >not< throw a NullPointerException.

        System.out.println(args.length);

        // however, this will throw NullPointerException
        String s = null;
        System.out.println(s.length());
    }
}
