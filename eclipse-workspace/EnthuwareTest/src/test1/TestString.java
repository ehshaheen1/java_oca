package test1;
import test1example.*;
public class TestString {

   public static void main(String[] args){
	  String hello1= "Hel"+"lo";
      String hello = "Hello", lo = "lo";
      System.out.print((test1.Other.hello == hello) + " ");    //line 1
      System.out.print((test1example.Other.hello == hello) + " ");   //line 2
      System.out.print((hello == ("Hel"+"lo")) + " ");           //line 3 //Here Hel + lo does not assigned to variable so it concates and put in memory pool
      System.out.print((hello == ("Hel"+lo)) + " ");              //line 4
      System.out.println(hello == ("Hel"+lo).intern());          //line 5
   }
}
class Other { static String hello = "Hello"; }

