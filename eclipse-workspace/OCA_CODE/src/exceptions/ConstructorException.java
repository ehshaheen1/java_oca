package exceptions;

public class ConstructorException {


    // constructor can throw an exception
    // and if it is a checked exception, it has to be handled
    // just like any other checked exception

    String name;
    int age;

    ConstructorException() throws Exception {
        name = "Clark Kent";
        age = 200;
        throw new Exception("exception from a constructor");
    }

    public static void main(String[] args) {
        try {
        	ConstructorException a = new ConstructorException();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

}
