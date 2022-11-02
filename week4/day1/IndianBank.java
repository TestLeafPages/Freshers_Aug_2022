package week4.day1;

public class IndianBank extends Bank{

	public void saving() {
		System.out.println("Indian bank saving");
	}
	public static void main(String[] args) {
		IndianBank bank=new IndianBank();
		bank.saving();
		bank.doposit();
	}
}
