package inheritance.Data;

public class ChildClassVarInherFromParent extends InheritedVarParent{


boolean manners = true;
static int iq = 100;


public static void main(String[] args) {

	ChildClassVarInherFromParent jerry = new ChildClassVarInherFromParent();
    System.out.println(jerry.manners);
    System.out.println(jerry.iq);
    

    InheritedVarParent larry = new InheritedVarParent();
    System.out.println(larry.manners);
    System.out.println(larry.iq);
    
  //  InheritedVarParent ops= new ChildClassVarInherFromParent();
  //  System.out.println(ops.iq);

    System.out.println(new ChildClassVarInherFromParent().manners + " : " + new ChildClassVarInherFromParent().iq);
    System.out.println(new InheritedVarParent().manners + " : " + new InheritedVarParent().iq);

}
}