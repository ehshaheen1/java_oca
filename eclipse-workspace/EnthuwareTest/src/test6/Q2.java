package test6;


interface Bar{
    void bar();
}

abstract class FooBase{
   
  private static void bar(){
     System.out.println("In static bar");  
  }    
}

public class Q2 extends FooBase implements Bar {

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		
	}





}


