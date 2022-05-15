package test1;

public class CheckString {

	public static void main(String[] args) {

        String myStr = "good";
        char[] myCharArr = {'g', 'o', 'o', 'd' };
        
        String newStr = null;// If the reference is null, it is converted to the string "null" (four ASCII characters n, u, l, l).
        for(char ch : myCharArr){
            newStr = newStr + ch; 
            System.out.println(newStr);
         
        }

        System.out.println((newStr == myStr)+ " " + (newStr.equals(myStr)));
        
    }

}
