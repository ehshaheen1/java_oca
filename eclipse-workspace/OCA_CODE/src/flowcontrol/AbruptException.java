package flowcontrol;

public class AbruptException {

	public static void main(String[] args) {

        int [][] integerArray2D = new int[][] {{100, 101, 102}, {200, 201, 202}};

        int index = 1;

        try {
            integerArray2D[abruptly()][index++] = 392;      // weird but valid
        } catch (Exception e) {
            System.out.println("catched!");
        }

        // variable index is not changed, since exception stopped further execution
        System.out.println(index);

    }

    static int abruptly () throws  Exception {
        throw new Exception();
    }
}
