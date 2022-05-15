package strings;

public class IndexOfMethod {

    // demo of String.indexOf() and lastIndexOf() methods

    public static void main(String[] args) {

        String bubbleBoy = "'Mmunities?! What the hell are 'mmunities?!";

        int a = bubbleBoy.indexOf("?!");
        System.out.println(a);              // 10

        float b = bubbleBoy.lastIndexOf("?!");
        System.out.println(b);              // 41.0

    }
}
