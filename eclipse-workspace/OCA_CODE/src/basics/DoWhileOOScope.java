package basics;

public class DoWhileOOScope {

    // simple scope issue in do-while loop

    public static void main(String[] args) {

        int marathonLength = 42;

        // this seems like a simple infinite loop, but in fact it is a scope issue
        // variables declared within do block are out of scope in the while condition

//        do {
//            int distanceSoFar = 0;
//            distanceSoFar++;
//        } while (distanceSoFar < marathonLength);       // this line does not compile
    }       
}
