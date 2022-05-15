package oca.chapter2;

import java.util.ArrayList;
import java.util.List;

public class OperatorPresedence {

	public static void main(String[] args) {
	    // Post-unary operators --> expression++, expression--
		// Pre-unary operators  --> 	++expression, --expression
		// Other unary operators -->  +, -, !,~
		// Multiplication/Division/Modulus --> *, /, %
		// Addition/Subtraction --> +, -
		// Shift operators -->  <<, >>, >>>
		// Relational operators --> <, >, <=, >=, instanceof
		// Equal to/not equal to --> ==, !=
		// Logical operators --> &, ^, |
		// Short-circuit logical operators --> &&, ||
		// Ternary operators --> boolean expression ? expression1 : expression2
		// Assignment operators --> =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>=
		

      List s1 = new ArrayList( );
      s1.add("a");
      s1.add("b");
      s1.add(1, "c");
      List s2 = new ArrayList(  s1.subList(1, 2) );// sublist(1,1) last one is exclusive so (1,0) return empty string
      s1.addAll(s2);
      System.out.println(s1);
   }
}

