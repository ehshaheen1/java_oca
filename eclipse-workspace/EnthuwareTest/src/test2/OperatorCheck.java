package test2;
 import static java.lang.Integer.MAX_VALUE;
 import static java.lang.System.out;;

public class OperatorCheck {

	public static void main(String[] args) {
     boolean b=   Boolean.parseBoolean("True");
     System.out.println(b);
     new Boolean(true);
		int s = 5;
        s = s+s + mx(s) + ++s;
        System.out.println(s); 
        

    out.println(MAX_VALUE);
    }
    

    static int mx(int s){
        for(int i=0; i<3; i++){
            s = s + i;
        }
        return s;
    }
}


   
