package method;


public class ContinueKeyword {

    // continue keyword can not be called from method.
    // it can be used in loops only.

    public static void main(String[] args) {

        callingSomeAlternativeMethod();
//        continue;       // does not compile
    }

    private static void callingSomeAlternativeMethod() {

        System.out.println("Hello from this method!");
//        continue;       // does not compile
        System.out.println("Second statement");
    }
    
}
