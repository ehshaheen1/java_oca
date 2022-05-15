package test1;

class AB{
}

class AA extends AB { 
}


public class GetClassType{
    public static void main(String[] args) throws Exception {
        AB a = new AB();
        AA aa = new AA(); // GetClass Type means object type
        a = aa;
        System.out.println("a = "+a.getClass());
        System.out.println("aa = "+aa.getClass());


    Object t = new Integer(107);
    int k = ((Integer) t).intValue()/9; // Object class does not have intValue()  so compile time get error
    System.out.println(k);

    }
}
 


