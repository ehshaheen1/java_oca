package operators;

public class SplittingProfit {

    public static void main(String[] args) {
        calculateMyShare (26900.00, 13.84);
   
    }


    public static long calculateMyShare (double annualProfit, double mySharePercentage) {
    	
    	
        //Question
       // return (long) annualProfit/mySharePercentage;       // does not compile
        return (long) (annualProfit/mySharePercentage);     // proper cast

    }
}
