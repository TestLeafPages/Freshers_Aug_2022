package week2.day1;

public class LearnString2 {
public static void main(String[] args) {
	String text="TestLeaf";
	int length = text.length();
	System.out.println(length);
	int[] num= {1,2,3,4,5};
	int length2 = num.length;
	System.out.println(length2);
	
	
	String  name="PrAveeN";
	
	String lowerCase = name.toLowerCase();
	System.out.println(lowerCase);
	
	String upperCase = name.toUpperCase();
	System.out.println(upperCase);
	
	char[] charArray = upperCase.toCharArray();
	for (int i = 0; i < charArray.length; i++) {
		//System.out.println(charArray[i]);
	}
	
	//String reverse
	for (int i= charArray.length-1;i>=0 ;i--) {
		System.out.println(charArray[i]);
	}
	
}
}
