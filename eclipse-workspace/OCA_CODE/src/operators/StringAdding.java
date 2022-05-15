package operators;

public class StringAdding {

    public static void main(String[] args) {

        System.out.println("i" + 'j' + 3);
        System.out.println("i" + 3);
        System.out.println('i' + 3);            // weird but valid, outputs 108
        System.out.println('a' + 3 + "c");

//        String str1 = 10;                   // does not compile
//        String str2 = new Integer(10);      // does not compile
//        String str3 = 10 + new Integer(10); // does not compile
//        String str4 = 'k';                  // does not compile
//        String str5 = 10 + 10;              // does not compile
//        String str6 = 'k' + 10;             // does not compile
        String str7 = "h" + 'k' + 10;
        String str8 = 'k' + "h" + 10;
        String str10 = 'k' + 10 + "h";
        System.out.println(str7);
        System.out.println(str8);
        System.out.println(str10);

    }

}