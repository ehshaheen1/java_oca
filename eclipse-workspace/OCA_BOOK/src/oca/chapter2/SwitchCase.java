package oca.chapter2;

//Data types supported by switch statements include the following:
//int and Integer
//byte and Byte
//short and Short
//char and Character
//String 
//enum values

public class SwitchCase {

	public static void main(String[] args) {
		System.out.println((byte)130);
		final byte b= 10;
		switch(b)
		{
		case (byte)128:
		break;
		}
		getSortOrder("Enadul","Anwar");
		check();
	}
	
	public static void check() {
		 char value='a';
		//short bt= 10;
		 switch(value)
		 {
		 
		 case 97: System.out.println("case 97");
		 break;
		 default: System.out.println("default");
		 }
		
	}
	
	private static int getSortOrder(String firstName, final String lastName) {
	final String middleName = "Patricia";
		final String suffix = "JR";
		int id = 0;
		switch (firstName) {
		case "Test":
			return 52;
		case middleName: // DOES NOT COMPILE
			id = 5;
			break;
		case suffix:
			id = 0;
			break;
	//	case lastName: // DOES NOT COMPILE //Its not constant as passed from parameter. Even being final
		//	 id = 8;
			//break;
	//	case 5: // DOES NOT COMPILE
			//id = 7;
			//break;
	//	case 'J': // DOES NOT COMPILE
			//id = 10;
			//break;
	//	case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
			//id = 15;
			//break;
		}
		return id;
	}
	
	

}
