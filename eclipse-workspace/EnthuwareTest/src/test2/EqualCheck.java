package test2;

import java.util.Objects;

public class EqualCheck {
	
	String name;
	int id;

	public static void main(String[] args) {
		
		EqualCheck o1= new EqualCheck();
		EqualCheck o2= new EqualCheck();
		if(o1.equals(o2))
		{
			System.out.println("OPS");
		}
		else {System.out.println("False");}
		
	}

	/*
	 * @Override public int hashCode() { return Objects.hash(id, name); }
	 */

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EqualCheck other = (EqualCheck) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
