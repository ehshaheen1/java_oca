package test6;

class M { }
class N{
   private M m = new M();
   public void makeItNull(M pM){
      pM = null;
   }
   public void makeThisNull(){
      makeItNull(m);
   }
   public static void main(String[] args){
      N n = new N();
      n.makeThisNull();
      System.out.println(n.m);
   }
}



