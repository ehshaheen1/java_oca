package oca.chapter4;

public class PrimitiveOverloading {
         // First it will check exact match, then widening , then auboxing, then var args
		/*public void fly(int i) {
			System.out.print("int ");
		} */
		public void fly(Integer l) {
		System.out.print("Integer ");
		}
		/*public void fly(long l) {
			System.out.print("long ");
		}
		public void fly(float l) {
			System.out.print("float ");
		} */
		public void fly(double l) {
			System.out.print("double ");
		} 
		public static void main(String[] args) {
			PrimitiveOverloading p = new PrimitiveOverloading();
			p.fly(123);
			p.fly(123L);
			p.fly(123.00f);
			p.fly(123.455);
		}
}
