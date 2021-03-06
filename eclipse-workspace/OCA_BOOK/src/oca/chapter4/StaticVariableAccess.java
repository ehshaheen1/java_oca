package oca.chapter4;

public class StaticVariableAccess {
   
	public static int count = 0; // static variable
	 public StaticVariableAccess()
	 {
		 count++;
	 }
	
	public static void main(String[] args) { // static method
		System.out.println(count);
		StaticVariableAccess k = new StaticVariableAccess();
		System.out.println(k.count); // k is a Koala
		k = null;// We can access static variable by creating object, even in null reference
		System.out.println(k.count);
		
		StaticVariableAccess.count = 4;
		StaticVariableAccess koala1 = new StaticVariableAccess();
		StaticVariableAccess koala2 = new StaticVariableAccess();
		//koala1.count = 6;
		//koala2.count = 5;
		System.out.println(StaticVariableAccess.count); 
	
		
		StaticVariableAccess c1 = new StaticVariableAccess();
		StaticVariableAccess c2 = new StaticVariableAccess();
		StaticVariableAccess c3 = new StaticVariableAccess();
		System.out.println(count);
  }
}