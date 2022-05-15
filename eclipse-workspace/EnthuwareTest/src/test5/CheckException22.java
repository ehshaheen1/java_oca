package test5;

public class CheckException22 {

   protected void m() throws Exception{}
}

//in file B.java
 class B1 extends CheckException22{
   public void m(){ }
}

//in file TestClass.java
 class TestClass{
   public static void main(String[] args) throws Exception{
	   CheckException22 b= new B1();
	   b.m();
   }
}
 

