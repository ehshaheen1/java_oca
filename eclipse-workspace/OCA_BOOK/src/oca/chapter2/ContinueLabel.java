package oca.chapter2;

/** 
 * 
 * @author TABLE 2.5 Advanced flow control usage
          Allows optional labels   Allows break statement   Allows continue statement
	if                    Yes                No                       No
   while                  Yes                Yes                      Yes
  do while                Yes                Yes                      Yes
   for                    Yes 				 Yes 					  Yes
   switch 				  Yes                Yes 					  No
 *
 */

public class ContinueLabel {
	
	public static void main(String[] args) {
		count();
		FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
			for (char x = 'a'; x <= 'c'; x++) {
				if (a == 2 || x == 'b')
					continue FIRST_CHAR_LOOP;
				System.out.print(" " + a + x);
			}
		}

	}
	
	public static void count() { //Break label can work on if block but continue will not . Only break will not work
	m1:	if(true)
		{
		  System.out.println("hjhsdfhjshf");
			break m1;
		}

	System.out.println("lllllll");
	}
	
	
	

}
