package method;

 enum Weather {

  SUNNY(1),
  RAIN(2),
  SNOW(3);

  final int weatherCode;

//  // enum constructor
  // enum constructor can not be public or protected
   Weather (int code) {     // does not compile
     this.weatherCode = code;
  }

}
public class Day {

    // enum constructor can not be public or protected

    public static void main(String[] args) {

//        Weather a = Weather.SNOW;

    }

}