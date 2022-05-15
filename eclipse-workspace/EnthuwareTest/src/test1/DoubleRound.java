package test1;

public class DoubleRound {

  public static int getSwitch(String str){
      return (int) Math.round( Double.parseDouble(str.substring(1, str.length()-1)) ); //"-0.50" ->0 -6 -5 -4 -3 -2 -1  0 1 2 3
  }
  public static void main(String args []){
    switch(getSwitch(args[0])){
      case 0 : System.out.print("Hello ");
      case 1 : System.out.print("World"); break;
      default : System.out.print("Good Bye");
    }
  }
}

