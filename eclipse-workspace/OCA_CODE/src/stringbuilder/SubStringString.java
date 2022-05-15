package stringbuilder;

public class SubStringString {

	// does method String.substring works with only one argument? the answer is yes.

    public static void main(String[] args) {

        String postmodernPrometheus = "The Great Mutato";

        // classical use
        System.out.println(postmodernPrometheus.substring(10, 16));

        // one argument, creates string from input index to the end
        System.out.println(postmodernPrometheus.substring(10));

        // out of bounds argument
//        System.out.println(postmodernPrometheus.substring(10,20));      // throws runtime StringIndexOutOfBoundsException
//        System.out.println(postmodernPrometheus.substring(20));         // throws runtime StringIndexOutOfBoundsException


    }

}
