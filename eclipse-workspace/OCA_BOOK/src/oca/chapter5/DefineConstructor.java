package oca.chapter5;

class SuperClass{
	private int age;

	public SuperClass(int age) {
		super();
		this.age = age;
	}
}
public class DefineConstructor extends SuperClass {
  public DefineConstructor()
	{
		super(12);// Any constructor java will put super() in it.
	}
 // public DefineConstructor(int x)
//	{
		//this();// Any constructor java will put super() in it.
//	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
