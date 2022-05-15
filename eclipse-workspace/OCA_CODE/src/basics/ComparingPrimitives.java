package basics;

public class ComparingPrimitives {
	// primitive integer types and decimals can be compared with == operator.
    // if decimal value corresponds with integer, result is true

    public static void main(String[] args) {

        double year1 = 2017.0;

        int year2 = 2017;
        System.out.println(year1 == year2);

        short year3 = 2017;
        System.out.println(year3 == year1);
        System.out.println(year3 == year2);

        Short year4 = 2017;
        System.out.println(year4 == year1);
        System.out.println(year4 == year2);
        System.out.println(year4 == year3);
        
        int position = 0;
        while (position-- < 10) {       // this will evaluate to false when value becomes smaller than -2147483648, integer's smaller value
            continue;
        }
        String result = position > 20 ? "Larger than 20" : "Smaller than 20";

        System.out.println(position);
        System.out.println(result);
  }
}
