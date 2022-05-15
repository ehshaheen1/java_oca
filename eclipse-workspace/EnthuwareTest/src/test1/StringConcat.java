package test1;

public class StringConcat {

    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
           str.concat(str+" "+ind); // Here str is null ref calling to concat method so we know null refer cocant method give you nullpointerexception
            ind++;
        }
    }
    
    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }
    
    public static void main(String[] args) {
    	StringConcat ot = new StringConcat();
        String[] arr = new String[2];
        arr[0]="A";
        arr[1]="B";
        ot.initData(arr);
        ot.printData(arr);
    }
}

