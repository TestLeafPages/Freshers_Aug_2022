package week5.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate2 {
public static void main(String[] args) {
	String name="testleaf";
	char[] charArray=name.toCharArray();
	Set<Character> uniqueNumber=new TreeSet<Character>();	
	
	
	for (int j = 0; j< charArray.length; j++) {
		uniqueNumber.add(charArray[j]);
			
		}
	System.out.println("Unique Number"+uniqueNumber);
	
//	System.out.println(uniqueNumber);
	
	
}
}
