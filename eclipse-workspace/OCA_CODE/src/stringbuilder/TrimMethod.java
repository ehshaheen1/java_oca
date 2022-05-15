package stringbuilder;

public class TrimMethod {


    // trim() method is in the String class,
    // not StringBuilder class.

    public static void main(String[] args) {

        StringBuilder sh = new StringBuilder("  Smeg Head   ");

//        sh.trim();      // does not compile

        String sh2 = " smeg head    ";
        System.out.println(sh2.trim());

    }

}
