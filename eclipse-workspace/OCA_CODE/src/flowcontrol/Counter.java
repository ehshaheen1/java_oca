package flowcontrol;

public class Counter {

	// adding numbers smaller than 12 and undividable by three
// 2/3= 0 but 2/3 gonna be 2
    public static void main(String[] args) {

        int counter = 0, sum = 0;

        do {
            if (counter % 3 == 0) continue;
            sum += counter;
            System.out.println("Sum "+sum);
        } while (counter++ < 11);
        System.out.println(sum);
    }
}
