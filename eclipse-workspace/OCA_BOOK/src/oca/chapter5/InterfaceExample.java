package oca.chapter5;

interface CheckInterface{
  int x =10;
 static void IntMethod() {
	 System.out.println("Parent int method");
 }
 default void DefMethod() {}
}
public class InterfaceExample implements CheckInterface{
	
	static void IntMethod() { //Interface static method cant override. iTs like interface final variable
		System.out.println("class interface method");
	}
	
	public void DefMethod()
	{
		
	}
    
	public static void main(String[] args) {
		//x=20;  //Interface variable can't modified in subclass because by default interface variable are public static final.
		System.out.println(x);
		 CheckInterface ci= new InterfaceExample();
		 CheckInterface.IntMethod();
		 IntMethod();

	}

}
