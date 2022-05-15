package method.wrappersignature;

public class Temperature {

    // widening is preferred to boxing/unboxing


    public static void main(String[] args) {

        int temp1 = 40;
        Integer temp2 = 50;
        float temp3 = 60.0f;

        Temperature t = new Temperature();

        t.printTemperature(temp1);        // prints float, since wider primitive has priority over wrapper class
        t.printTemperature(temp2);
        t.printTemperature(temp3);

    }

//    private void printTemperature (int temp) {
//        System.out.println("int");
//    }

    private void printTemperature (Integer temp) {
        System.out.println("Integer wrapper");
    }

    private void printTemperature (float temp) {
        System.out.println("float");
    }
}