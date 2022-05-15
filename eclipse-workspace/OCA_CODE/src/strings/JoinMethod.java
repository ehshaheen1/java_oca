package strings;

public class JoinMethod {

    // demo of String.join() method

    public static void main(String[] args) {

        // telephone example
        String [] elementsArray = {"555", "1234", "5678"};
        String result = String.join("-",elementsArray);
        System.out.println(result);

        // addition example
        String [] elementsArray2 = {"5", "2", "9"};
        String sum = String.join("+", elementsArray2);
        System.out.println(sum);

    }
}
