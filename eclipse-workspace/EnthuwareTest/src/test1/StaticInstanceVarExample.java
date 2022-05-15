package test1;

class ABCD{
   int x = 10;
   static int y = 20;
}
class MNOP extends ABCD{
   int x = 30;
   static int y = 40;
}

public class StaticInstanceVarExample {

	 public static void main(String[] args) {
		 ABCD a= new MNOP();
		 
	   System.out.println(new MNOP().x+", "+ a.x);

		String str1 = "one";
		String str2 = "two";
		System.out.println( str1.equals(str1=str2) );

        String[] sa = {"a", "b", "c"};
        for(String s :  sa){
            if("b".equals(s)) continue;
            System.out.println(s);
            if("b".equals(s)) break;
            System.out.println(s+" again");
        }
    }

	 }


