package week4.day1;

public class Parent extends GrandParent {

	public void ecrBungalow() {
		System.out.println("Parent Bungalow");
	}
	public static void main(String[] args) {
		Parent parent =new Parent();
		parent.ecrBungalow();
		parent.bungalow();
		parent.teaEstates();
	}
}
