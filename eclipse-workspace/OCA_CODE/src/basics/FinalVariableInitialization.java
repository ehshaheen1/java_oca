package basics;

public class FinalVariableInitialization {

    // final variables must be initialised in one of three possible ways:
    // during declaration, in the constructor, or in the initialisation block.
    // if class initialises these fields in two or more ways, there will be a compile-time error.

	/*
	 * final int ID = 0; final String title = "title"; final String author =
	 * "author"; final int year = 0; final long ISBN = 0;
	 */
	
	final int ID ;
    final String title ;
    final String author ;
    final int year ;
    final long ISBN ;

    // initialisation block, executed on every object creation
 //   {
  //      ID = 0;
//        title = "title";
//        author = "author";
 //       year = 0;
//        ISBN = 0;
//    }

    // constructor
    public FinalVariableInitialization(int ID, String title, String author, int year, long ISBN) {
        this.ID = ID;
        this.title = title;
        this.author = author;
        this.year = year;
        this.ISBN = ISBN;
    }

    public static void main(String[] args) {

    	FinalVariableInitialization a = new FinalVariableInitialization(0,"S","P",123,454);
        System.out.println(a.title);
    } 
}
