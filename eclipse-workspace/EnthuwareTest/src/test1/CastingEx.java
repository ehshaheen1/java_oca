package test1;

public class CastingEx {
    public static void testInts(Integer obj, int var){
        obj = var++; // When we re assigned we lost the reference
        obj++;
    }
    public static void main(String[] args) {
        Integer val1 = new Integer(5);
        int val2 = 9;
        testInts(val1++, ++val2);//5
        System.out.println(val1+" "+val2);
    }
}           

