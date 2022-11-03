package week4.day2;

public class Samsung implements AndroidDesign,SamsungDesign{

	public void samsungNote() {
		System.out.println("Samsung note");
	}

	@Override
	public void makeCall() {
		// TODO Auto-generated method stub
		System.out.println("make call");
	}

	@Override
	public void sendSms() {
		// TODO Auto-generated method stub
		System.out.println("Send SMs");

	}

	@Override
	public void startPhone() {
		// TODO Auto-generated method stub
		System.out.println("Start phone");
	}
	public static void main(String[] args) {
   Samsung sam=new Samsung();
  // AndroidDesign  obj=new AndroidDesign();
   sam.makeCall();
   sam.sendSms();
   sam.samsungNote();
   sam.startPhone();
	}

	@Override
	public void faceAuthendication() {
		// TODO Auto-generated method stub
		System.out.println("Face Authendication");
	}

	@Override
	public void voiceRecognization() {
		// TODO Auto-generated method stub
		System.out.println("Voice Recognization");
	}

}
