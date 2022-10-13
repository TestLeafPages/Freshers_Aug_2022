package week1.day4;

public class LearnString {
public static void main(String[] args) {
	//String litteral
	String text="TestLeaf";
	//string covert text in to lowercase
	String lowerCase = text.toLowerCase();
	
	System.out.println("lowerCase  "+lowerCase);
	
	String name="anil";
	String upperCase = name.toUpperCase();
	System.out.println(upperCase);
      char[] charArray = text.toCharArray();
      System.out.println(charArray);
      for (int i = 0; i < charArray.length; i++) {
	System.out.println(charArray[i]);
	}
	
	//using new keyword:
	String name2=new String("TestLeaf");
}
}
