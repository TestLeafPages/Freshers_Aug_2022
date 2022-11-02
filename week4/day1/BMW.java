package week4.day1;

public class BMW extends Car{

	public void applyGear() {
		System.out.println("Apply Gear");
	}
	public static void main(String[] args) {
		BMW bmw=new  BMW();
		bmw.applyBreak();
		bmw.applyGear();
		bmw.switchOnAc();
		
	}
}
