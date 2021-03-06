package oca.chapter5;

class ParentClass {
	protected int size=5;
	private int age;

	public ParentClass(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}
	public void displaySharkDetails() {}
}

public class InheritedClassMembers extends ParentClass {
	private int numberOfFins = 8;
    protected int size;
	public InheritedClassMembers(int age) {
		super(age);
		super.size = 4; // We can access parent class public , protected variable with no keyword ,this/super from child class 
	}

	public void displaySharkDetails() {
		System.out.println("Shark with age: " + getAge());//10
		System.out.println(" and " + super.size + " meters long");//4
		System.out.println(" and " + size + " meters long");//4
		System.out.println(" with " + numberOfFins + " fins");//8
	}
	
	public static void main(String[] args) {
		ParentClass pc= new InheritedClassMembers(12);
		//InheritedClassMembers im= new InheritedClassMembers(10);
		pc.displaySharkDetails();

	}

}
