package oca.chapter3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListOperation {
	
	public static void main(String[] args) {
		//Testing add method
		 List<String> birds = new ArrayList<>();
	     birds.add("hawk"); // [hawk]
		 birds.add(1, "robin"); // [hawk, robin]
		 birds.add(0, "blue jay"); // [blue jay, hawk, robin]
		 birds.add(3, "cardinal"); // [blue jay, cardinal, hawk, robin]// We can add element within the size of arraylist.suppose i have 3 elemnt o,1,2 then i can insert element 0-3
		 System.out.println(birds); // [blue jay, cardinal, hawk, robin]
		 
		 //Remove method
		 //boolean remove(Object object)
		// E remove(int index)
		 
		  List<String> birds1 = new ArrayList<>();
		  birds1.add("hawk"); // [hawk]
		  birds1.add("hawk"); // [hawk, hawk]
		  System.out.println(birds1.remove("cardinal")); // prints false
		  System.out.println(birds1.remove("hawk")); // prints true
		  System.out.println(birds1.remove(0)); // prints hawk
		  System.out.println(birds1); // []
		  
		  //Set method // set() method changes one of the elements of the ArrayList without changing the size
		  //E set(int index, E newElement)
		   List<String> birds2 = new ArrayList<>();
		   birds2.add("hawk"); // [hawk]
		   System.out.println(birds2.size()); // 1
		   birds2.set(0, "robin"); // [robin]
		   System.out.println(birds2.size()); // 1
		   birds2.set(1, "robin"); // IndexOutOfBoundsException
		   
		   //ArrayList equals methods
		   // if Two array has same sequence of element and should be same length and same types then equal method return true 
		    List<String> one = new ArrayList<>();
		    List<String> two = new ArrayList<>();
		    System.out.println(one.equals(two)); // true
		    one.add("a"); // [a]
		    System.out.println(one.equals(two)); // false
		    two.add("a"); // [a]
		    System.out.println(one.equals(two)); // true
		    one.add("b"); // [a,b]
		    two.add(0, "b"); // [b,a]
		    System.out.println(one.equals(two)); // false
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   

	}

}
