package strings.pool;

public class SilverBullet {

	 public static void main(String[] args) {

	        String sv1 = "Silver Bullet";
	        String sv2 = "";
	        sv2 = sv2 + "Silver Bullet";

	        System.out.println(sv1.equals(sv2));    // equals() compares values
	        System.out.println(sv1 == sv2);    // == operator checks memory location //Its false because there is a plus + sign to calc SV2


	    }
}
