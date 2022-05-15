package test2;

public class Exception12 {

	public static void main(String[] args) {

        try{
            doTest();
        }
        catch(MyException me){
          //  System.out.println(me);
          //  System.out.println("Hello");
        }
    }
    
    static void doTest() throws MyException{
        int[] array = new int[10];
        array[10] = 1000;// Here it occurs arrayindexoutofboundexception so it did not handle and did not declare so it will stop here and get RT exception
        doAnotherTest();
    }
    
    static void doAnotherTest() throws MyException{
        throw new MyException("Exception from doAnotherTest");
    }
}
class MyException extends Exception {
    public MyException(String msg){
     super(msg);
    }
}

