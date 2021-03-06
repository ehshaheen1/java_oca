package basics;

public class StaticAndInstanceVariable {

    // static variables and instance variables can not have the same name

    static String name = "Fallon";
//    String name = "Jimmy";                //one of these two declarations have to be commented out

    public static void main(String[] args) {

        // however, local variable will not cause compile-time error,
        // but simply hide or shadow the static variable
        System.out.println(name);
        String name = "Jimmy";
        System.out.println(name);
  }
}