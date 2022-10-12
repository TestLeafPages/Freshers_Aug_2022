package week1.day2;

public class Mobile {

	public void makeCall() {
		System.out.println("Make call");
	}
	 void sendText() {
		System.out.println("Send Text ");
	}
	protected void shareDocument() {
		System.out.println("Share Document");
	}
	private void sharePicture() {
		System.out.println("Share Picture");
	}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		mob.makeCall();
		mob.shareDocument();
		mob.sendText();
		mob.sharePicture();
		
	}
}
