package test2;

public class CheckBreak {

    private static double side = 0;  // LINE 2


	public static void main(String[] args) {
		CheckBreak ch= new CheckBreak();
		System.out.println(side);
		
		crazyLoop();
	}

static void crazyLoop(){
   int c = 0;
   JACK: while (c < 8){
       JILL: System.out.println(c);
      // if (c > 3) break JILL; else c++;// We can use break without lavel in its inside the while loop but we cant use directly in if block
   }
}

}
