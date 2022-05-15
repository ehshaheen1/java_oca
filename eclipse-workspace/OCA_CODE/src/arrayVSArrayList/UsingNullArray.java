package arrayVSArrayList;

public class UsingNullArray {
	
    public static int [] getWhatYouWant () {
    	int[] ops= {1,2,3,4,5};
        return ops;
    }

    public static String [] getWhatYouNeed () {
        String [] get = {"You ", "can ", "get ", "what ", "you ", "need."};
        return get;
    }

    public static void main(String[] args) {

        int index = 4;
        try {
            getWhatYouWant()[index=3]--;        // weird but valid!
        } catch (NullPointerException e) {

        }
        System.out.println("index = " + index);
        System.out.println("You cant always get what you want.");


        boolean trySometimes = true;
        if (trySometimes) {
            for (int i = 0; i < 6; i++)
                System.out.print(getWhatYouNeed()[i]);    // weird but valid
        }
    }
}
