package oca.chapter1;

import java.util.Date; //Specific will get high precedence
//import java.sql.Date; // DOES NOT COMPILE

public class NamingConflict {

	public static void main(String[] args) {
		Date date;
		java.sql.Date newDate; // To avoid ambiguity same class name diff package have import full qualified name 
		

	}

}
