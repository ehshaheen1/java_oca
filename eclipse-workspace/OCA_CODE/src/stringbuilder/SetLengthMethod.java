package stringbuilder;

public class SetLengthMethod {

	// demo of setLength() method from StringBuilder class

    public static void main(String[] args) {

        StringBuilder an = new StringBuilder("enadul");
        System.out.println(an.length() + ": " + an);

        an.setLength(3);
        System.out.println(an.length() + ": " + an);

        an.setLength(40);
        System.out.println(an.length() + ": " + an);

//        an.setLength(-40);      // compiles, but throws a runtime StringIndexOutOfBoundsException

    }
}
