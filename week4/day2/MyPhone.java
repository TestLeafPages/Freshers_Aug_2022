package week4.day2;

import java.util.ArrayList;
import java.util.List;

public class MyPhone {
public static void main(String[] args) {
	Samsung phone=new Samsung();
	phone.faceAuthendication();
	phone.voiceRecognization();
	phone.makeCall();
	phone.sendSms();
	phone.startPhone();
	phone.samsungNote();
	
	SamsungDesign obj=new Samsung();
	obj.faceAuthendication();
	obj.voiceRecognization();
	
	
	AndroidDesign obj2=new Samsung();
	obj2.makeCall();
	obj2.startPhone();
	obj2.sendSms();
	
	
	
	
	//List<String> obj=new ArrayList<>();
	
	
}
}
