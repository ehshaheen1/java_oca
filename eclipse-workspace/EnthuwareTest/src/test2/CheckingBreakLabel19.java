package test2;

public class CheckingBreakLabel19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		crazyLoop();
	}

	static void crazyLoop() {
		int c = 0;
		JACK: while (c < 8) {
			System.out.println(c);
			JILL: if (c > 3) {
				break JILL;
				}
			else {
				c++;
				}
		}
 }
}


