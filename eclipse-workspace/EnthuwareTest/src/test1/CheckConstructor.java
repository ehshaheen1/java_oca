package test1;
import test1example.*;

public class CheckConstructor extends A {

	CheckConstructor() {
	}

	public void print() {
		System.out.println("B");
	}

	public static void main(String[] args) {
		new CheckConstructor();
	}
}


