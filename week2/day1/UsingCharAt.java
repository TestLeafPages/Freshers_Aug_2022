package week2.day1;

public class UsingCharAt {
public static void main(String[] args) {
	
	String test="TestLeaf";
	char charAt2 = test.charAt(3);
	System.out.println("charAt2 "+charAt2);
	String text2="GoodEvening";
	
	char[] charArray = test.toCharArray();
	for (int i = 0; i < test.length(); i++) {
		char charAt = test.charAt(i);
		System.out.println(charAt);
	}
}
}
