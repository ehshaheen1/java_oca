package test1;

interface Bozo{
         int type = 0;
         public void jump();
}

public class InterfaceQ18 implements Bozo{
         public InterfaceQ18(){
         //  type = 1; // We can't assigned as variable is final
         }

         public void jump(){
            System.out.println("jumping..."+type);
         }

         public static void main(String[] args){
            Bozo b = new InterfaceQ18();
            b.jump();
         }
}


