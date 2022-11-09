package week5.day1;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicate {
public static void main(String[] args) {
	//step1:Declare a String
	String name="amazon";
	//step1 a): String convert into character Array
	char[] charArray = name.toCharArray();

	System.out.println(charArray);
	//step1 b)sort this Array
	Arrays.sort(charArray);
	System.out.println(charArray);
	//step2:declare set
	Set<Character> uniqueCharacter=new LinkedHashSet<Character>();
	
	//itearate the character from charArray
	for (int i = 0; i < charArray.length; i++) {
		
		//add the character in set
		uniqueCharacter.add(charArray[i]);
	}
	//Print the Set
	System.out.println(uniqueCharacter);
	
	
	
	
	
	
}
}
