package operators;

public class DividingIntegers {

    public static void main(String[] args) {

        // in the case of integer division, remainder is discarded
        // despite the fact float type can accommodate it
        int a = 23;
        int b = 5;
        float c = a / b;
        System.out.println(c);      // output: 4.0


        // in this case, dividing float with integer casts integer to float (5.0)
        float x = 23;
        int y = 5;
        float z = x / y;
        System.out.println(z);      // output: 4.6

    }

}