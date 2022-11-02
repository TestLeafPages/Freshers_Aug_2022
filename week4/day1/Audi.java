package week4.day1;

public class Audi extends Car {

	public void openSunRoof() {
		System.out.println("Open Sun Roof");
	}
	public static void main(String[] args) {
		Audi audi=new Audi();
		audi.applyBreak();
		audi.switchOnAc();
		audi.openSunRoof();
	}
}
