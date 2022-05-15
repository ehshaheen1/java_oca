package stringbuilder;

public class ReverseMethod {


    // reverse method is part of the StringBuilder class
    // not String class.

    public static void main(String[] args) {

        StringBuilder lz = new StringBuilder("Led Zeppelin");
        lz.reverse();
        System.out.println(lz);

        String lz2 = "Led Zeppelin";
//        System.out.println(lz2.reverse());   // does not compile

    }
}
