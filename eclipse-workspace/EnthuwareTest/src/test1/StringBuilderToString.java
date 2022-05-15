package test1;

public class StringBuilderToString {

   private String theVal;
   public StringBuilderToString(String str){ this.theVal = str; }

    public static void main(String[] args) {
    	StringBuilderToString sw = new StringBuilderToString("How are you?");
        StringBuilder sb = new StringBuilder("How are you?");
        System.out.println("Hello, "+sw);
        System.out.println("Hello, "+sb);
   }
}

