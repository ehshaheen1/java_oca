package oca.chapter4;

public class StaticInitialization {
// static final variable can initialized in Static block
	private static final int NUM_SECONDS_PER_HOUR;
	static {
		int numSecondsPerMinute = 60;
		int numMinutesPerHour = 60;
		NUM_SECONDS_PER_HOUR = numSecondsPerMinute * numMinutesPerHour;
	}
	
	 private static int one;
	 private static final int two;
	 private static final int three = 3;
	// private static final int four; // DOES NOT COMPILE
	 static {
	 one = 1;
	 one=2;
	 two = 2;
	// three = 3; // DOES NOT COMPILE
	// two = 4; // DOES NOT COMPILE
	}
	// public StaticInitialization() {
	//		four=3; 
	//	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
