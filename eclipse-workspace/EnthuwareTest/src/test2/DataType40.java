package test2;

public class DataType40 {

	public static void main(String[] args) {



Integer i = new Integer(42);
Long ln = new Long(42);
Double d = new Double(42.0);

System.out.println(10==10.00);// Primitive is fine 

//System.out.println(i == ln);//== object type has to be same ref type
//System.out.println(ln == d);
System.out.println(i.equals(d));
System.out.println(d.equals(ln));
System.out.println(ln.equals(42));





	}

}
