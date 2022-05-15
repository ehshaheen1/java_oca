package strings;

public class GetCharMethod {

	   // demo of getChars() method

    public static void main(String[] args) {

        char [] copy = new char[20];

        String misery = "I'm your number one fan.";
       //getChars() method Copies characters from this string into the destination characterarray. 
        misery.getChars(9, 23, copy, 0);

        System.out.println(copy);

    }
}
