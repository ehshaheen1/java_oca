package test1;

import java.util.Stack;

public class CallByReference {

	public static void main(String[] args) {

      Stack s1 = new Stack ();
      s1.push(2);
      Stack s2 = new Stack ();
      processStacks (s1,s2);
      System.out.println (s1 + "    "+ s2);
   }
   public static void processStacks(Stack x1, Stack x2){
      x1.push (new Integer ("100")); //assume that the method push adds the passed object to the stack.
      x2 = x1;// When we assigned reference to reference then caller will not changed 
   }
 }


