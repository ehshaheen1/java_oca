package basics;

public class CheckBoolean {


    // condition expression in an if statement >can< contain method call
    // as long as it returns boolean value

    public static void main(String[] args) {

        if (haveMatches()) {
            System.out.println("C'mon baby, light my fire!");
        }

//        if (haveLighter()) {                  // does not compile, not a boolean value
//            System.out.println("Sleep now with the fire.");
//        }


    }

    public static boolean haveMatches () {
        return true;
    }

    public static int haveLighter() {
        return 5;
    }
}
