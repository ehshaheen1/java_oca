package test5;


class A{
   public A() { }
   public A(int i) {   System.out.println(i );    }
}
public class B{
   static A s1 = new A(1);
   A a = new A(2);
   public static void main(String[] args){
	   System.out.println(new Boolean(true));
      B b = new B();
      A a = new A(3);
   }
   static A s2 = new A(4);
   
}
