package strings;

public class StringImmutability {


    public static void main(String[] args) {

        //methods from String class do not affect the String object

        String name = "Norman Bates";
        name.concat(" owns a nice little motel.");
        System.out.println(name);

        name.substring(0,6);
        System.out.println(name);

        name.toLowerCase();
        System.out.println(name);

        // proper way to change a string
        name = name.toUpperCase();
        System.out.println(name);

        name = name.concat(" owns a nice little motel.");
        System.out.println(name);
    }
}
