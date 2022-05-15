package test2;

public class IfElseCause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



public int transformNumber(int n){
   int radix = 2;
   int output = 0;
   output += radix*n;
   radix = output/radix;
   if(output<14){
       return output;
   }
   else{
       output = output*radix/2;
       return output;
   }
  // else {  // If cant go two else 
   //    return output/2;
   }
}
//}
