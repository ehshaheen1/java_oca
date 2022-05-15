package operators;

public class Confusing4 {

    public static void main(String[] args) {

        int a = 3;

        if (a++ == 4)
            System.out.println("This is will not be printed, variable 'a' is evaluated before increment.");

        // a is now 4
        if (a == 4)
            System.out.println("This will be printed.");

        if (++a == 5)
            System.out.println("This will be printed, incrementing is done before evaluation.");

    }
}