package oca.chapter2;

public class CastingPrimitiveValue {

	public static void main(String[] args) {
		int x = (int)10.9;// Casting always goes floor/lower value and if value is out of range then it will return max value like max int
		int x1 = (int)100000000000000.0;
		System.out.println(x);
		System.out.println(x1);// It will give highest int value cause value is out of int range. Int take 10 digit
		System.out.println(Integer.MAX_VALUE);
		short y = (short)1921222; // Stored as 20678
		System.out.println(y);
		System.out.println(Short.MAX_VALUE);
		int z = (int)9L;
		System.out.println(z);
		long t = 192301398193810323L;
		
		//byte b= (byte)1222222222222222.0;
		//System.out.println(b);
		System.out.println(Byte.MAX_VALUE);

	}

}
