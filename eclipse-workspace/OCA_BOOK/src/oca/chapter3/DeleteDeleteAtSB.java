package oca.chapter3;

public class DeleteDeleteAtSB {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("abcdef");
		sb.delete(1, 3); // sb = adef  // Its delete from index 1 to 2(3-1)
		sb.deleteCharAt(4);
	}

}
