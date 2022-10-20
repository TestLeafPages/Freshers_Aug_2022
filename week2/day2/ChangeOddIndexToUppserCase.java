package week2.day2;

public class ChangeOddIndexToUppserCase {
public static void main(String[] args) {
	  String test = "changeme";
	  //output: cHaNgEmE	  
	 //a) Convert the String to character array
	  char[] charArray = test.toCharArray();
	 //b) Traverse through each character (using loop)
	  for (int i = 0; i < charArray.length; i++) {
	  //c)find the odd index within the loop (use mod operator)
		if(i%2!=0) {
	//d)within the loop, change the character to uppercase, 
		char upperCase = Character.toUpperCase(charArray[i]);
		System.out.print(upperCase);
			}
		
		//if the index is odd else don't change
		else {
		System.out.print(charArray[i]);
			}
	}
	 
	 
	}
}
