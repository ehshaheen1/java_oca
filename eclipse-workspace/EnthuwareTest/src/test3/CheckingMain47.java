package test3;

public class CheckingMain47 {
   public static void main(String[] args) { // If you dont pass anything on array(args) it will be pointing empty string / zero length
	   
	   System.out.println(args.length);
        boolean hasParams = (args == null ? false : true);
        if(hasParams){
            System.out.println("has params");
        }{
            System.out.println("no params");
        }
    }
}

