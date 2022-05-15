package operators;


public class OrOperator {

    public static void main(String[] args) {

        // logical OR operator
        // second part of the statement is not executed
        int unaffectedInteger = 0;
        System.out.println(true || 5 < unaffectedInteger++);
        System.out.println(unaffectedInteger);

        // bitwise OR operator
        // second part of the statement is executed
        int affectedInteger = 0;
        System.out.println(true | 5 >  affectedInteger++);
        System.out.println(affectedInteger);

    }
}
