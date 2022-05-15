package oca.chapter5;

class Parent{
	private int age;
	public int getAge() {
	return age;
	}
	public void setAge(int age) {
	this.age = age;
	}
}
	public class AccessingSuperClassMember extends Parent{
		public static void main(String[] args) {
			AccessingSuperClassMember as= new AccessingSuperClassMember();
			as.roar();
		}
	    private void roar() { // Here we cant access age variable from parent class becase its private
		System.out.println("The "+getAge()+" year old lion says: Roar!");
		}

}
