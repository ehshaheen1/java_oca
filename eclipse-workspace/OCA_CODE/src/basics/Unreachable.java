package basics;

public class Unreachable {
	// unreachable part of the for loop will make a code uncompilable

    public static void main(String[] args) {

        // first, valid loop
        for (int i = 0; i < 10; i++) {

            if (i == 5) System.out.print("HELLO ");
            else System.out.print("First loop ");

            System.out.print(i);

            System.out.println(" THIS IS REACHABLE !!!");

        }


        // second, valid loop
        for (int i = 0; i < 10; i++) {

            if (i == 5) break;
            else System.out.print("Second loop ");

            System.out.print(i);

            System.out.println(" THIS IS REACHABLE !!!");

        }


        // third, invalid loop
        for (int i = 0; i < 10; i++) {

            System.out.println("Third loop");

            if (i == 5) break;
            else continue;

            // because of the if condition, this part of code will never be executed,
            // since loop will either exit or initiate next iteration after the IF condition
        //    System.out.println(i);                          // does not compile
        //    System.out.println("UNREACHABLE !!!");          // does not compile

        }
    }
}
