package test1;

import test1example.InterfaceA;

public class CheckInterface35 implements InterfaceA{

	public static void main(String[] args) {
	  int thevalue =50;
	  CheckInterface35 s = new CheckInterface35();  //1
      int j = s.thevalue;       //2
      int k = InterfaceA.thevalue;    //3
      int l = thevalue;         //4  //We can access inherited variable directly .It will point instance child variable when it get same variable in child
      System.out.println(l);
   }
}



