package method;

public class PrintingNull {

    static String empty3;

    public static void main(String[] args) {

        // this will compile and produce 'null' as an output
        String empty1 = null;
        System.out.println(empty1);

        // local variable is not initialised, resulting with compilation error
        String empty2;
//        System.out.println(empty2);     // does not compile

        // class variables are automatically initialised with null
        System.out.println(empty3);


//        System.out.println(null + null);        // does not compile
//        System.out.println(null + 12);          // does not compile
//        System.out.println(12 + null);          // does not compile
//        System.out.println(true + null);        // does not compile
        System.out.println(true);
//        System.out.println(null + true);        // does not compile
        System.out.println("" + null + true);
        System.out.println("" + null);
        System.out.println(getStr() + null + true);
    }

    static String getStr () {
        return null;
    }

}