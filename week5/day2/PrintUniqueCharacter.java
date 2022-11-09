package week5.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class PrintUniqueCharacter {
public static void main(String[] args) {
	String name="shivasankar";
	
	//output  s,a,a
	
	//conver into character Array
	char[] charArray = name.toCharArray();
	
	
	//declare a empty set
	Set<Character>  uniqueCharacter=new LinkedHashSet<Character>();
	
	//Iterate the values from charArray
	for (Character unique : charArray) {
		if(!uniqueCharacter.add(unique)) {
			System.out.println(unique);
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
