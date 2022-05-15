package exceptions;

public class LayersOfExceptions {

	public static void main(String[] args) {

        try {
            throw new StringIndexOutOfBoundsException();
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("string index exception");
            throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException e) {              // this will >NOT< catch intended exception. additional try-catch is needed for proper handling.
            System.out.println("index out of bounds exception");
        } catch (Exception e) {
            System.out.println("every exception");
        } finally {
            System.out.println("finally block");
        }

        // this line will not be executed
       System.out.println("after party!");

    }
}
