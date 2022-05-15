package test4;

public class Q56 {
public static void main(String[] args) {
	int io= args.length-1;
	System.out.println(io);

Float f = null;
try{
   f = Float.valueOf("12.3");
   String s = f.toString();
   //System.out.println(s); "12.3"
   int i = Integer.parseInt(s);
   System.out.println(""+i);
}
catch(Exception e){
   System.out.println("trouble : "+e);
}

}
}
