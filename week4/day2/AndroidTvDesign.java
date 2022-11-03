package week4.day2;

public abstract  class AndroidTvDesign  implements AndroidDesign{
	
	
	public void changeChannel() {
		System.out.println("Change chennel");
	}
	public void increseVolume() {
		System.out.println("Change chennel");
	}
	
	public abstract  void enableWifi();
	
	public abstract void enableBluetooth();

}
