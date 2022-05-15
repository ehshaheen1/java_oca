package inheritance.interfaceexample;

public class Weather implements Rain, Snow{

    // implementation of badWeather() method will not cause ambivalence in compilation,
    // despite the identical method name in both interfaces.
    @Override
    public void badWeather() {
        System.out.println("Implementation of badWeather().");
    }


    public static void main(String[] args) {

        Weather a = new Weather();
        a.badWeather();                 // valid without casting
        ((Rain)a).badWeather();         // redundant cast, but valid
        ((Snow)a).badWeather();         // redundant cast, but valid

        // code will compile if there is no reference to the 'amountOf' constant
        // which is ambivalent and has to be accessed through interface name.
//        System.out.println(a.amountOf);           // does not compile
        System.out.println(((Snow)a).amountOf);     // valid
        System.out.println(((Rain)a).amountOf);     // valid

    }
}
