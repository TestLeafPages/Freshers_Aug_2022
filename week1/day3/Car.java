package week1.day3;

public class Car {
	public void applyBreak() {
		System.out.println("Apply Break");
	}
	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public void switchOnAc() {
		System.out.println("Switch on Ac");
	}
	public void applyAcclerate() {
		System.out.println("Apply Acclerate");
	}
public static void main(String[] args) {
	
	Car car=new Car();
	car.applyAcclerate();
	car.applyBreak();
	car.applyGear();
	car.switchOnAc();
	
}
}
