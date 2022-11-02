package week4.day1;

public class Auto extends Bajaj {

	public void handleStarter() {
		System.out.println("Handle starter");
	}
	public static void main(String[] args) {
		Auto auto=new Auto();
		auto.applyBreak();
		auto.handleStarter();
		auto.soundHorn();
	}
}
