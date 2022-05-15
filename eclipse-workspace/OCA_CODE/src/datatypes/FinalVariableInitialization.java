package datatypes;

public class FinalVariableInitialization {

	// final variables have to be initialised in one of three ways:
    // 1. simultaneously with declaration
    // 2. in the constructor
    // 3. in the instance block of initialisation

    final int speedOfLight1 = 299_792_458;      // initialisation with the declaration
    final int speedOfLight2;
    final int speedOfLight3;
    //final static int speedOfLight4;            // does not compile

    // instance block
    {speedOfLight2 = 299_792_458;}              // initialisation in the instance block

    public FinalVariableInitialization() {
        speedOfLight3 = 299_792_458;            // initialisation in the constructor
    }
    
    //static {speedOfLight4=454545;}
   
    public static void main(String[] args) {

    	FinalVariableInitialization a = new FinalVariableInitialization();

        System.out.println(a.speedOfLight1);
        System.out.println(a.speedOfLight2);
        System.out.println(a.speedOfLight3);

    }
}
