package oca.chapter1;
// If i remove line 1 2 and 3 then program will compile and execute successfully
 import java.lang.System;
 import java.lang.*;
 import java.util.*;
 import java.util.Random; //Specific class import has high priority and java.lang package will come automatically

 
 public class ImportExample {
	 
 public static void main(String[] args) {
   Random r = new Random();
   System.out.println(r.nextInt(10));
   }
 }