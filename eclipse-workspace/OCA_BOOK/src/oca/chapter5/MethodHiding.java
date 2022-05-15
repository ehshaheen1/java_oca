package oca.chapter5;

class ParentEx{
	public static void eat() {
		System.out.println("Bear is eating");
		}
}
public class MethodHiding extends ParentEx{
	public static void eat() {
		System.out.println("Panda bear is chewing");
		}
	public static void main(String[] args) { //Static method always execute based on reference type
		ParentEx pex= new MethodHiding();
		pex.eat();

	}

}
