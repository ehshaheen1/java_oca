package oca.chapter5;

class ReptileNew {
	public String getName() {
		return "Reptile";
	}
}

class Alligator extends ReptileNew {
	public String getName() {
		return "Alligator";
	}
}

class Crocodile extends ReptileNew {
	public String getName() {
		return "Crocodile";
	}
}

public class PolymorphicParameter {
	public static void feed(ReptileNew reptile) { // ReptileNew reptile= new Alligator();
		System.out.println("Feeding reptile " + reptile.getName());
	}

	public static void main(String[] args) {
		feed(new Alligator());
		feed(new Crocodile());
		feed(new ReptileNew());
	}
}
