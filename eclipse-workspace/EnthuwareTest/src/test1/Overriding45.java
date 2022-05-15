package test1;


class Base{
   public short getValue(){ return 1; } //1
}
class Base2 extends Base{
  // public byte getValue(){ return 2; } //2  // Overriding primitive has to be same but Object can have co variant return type
}
public class Overriding45{
   public static void main(String[] args){
      Base b = new Base2();
      System.out.println(b.getValue()); //3
   }
}

