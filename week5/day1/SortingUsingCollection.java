package week5.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection {
public static void main(String[] args) {
	// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

	String[] value= {"Google","Microsoft","TestLeaf","Maverick"};
	
		// get the length of the array	
	int len = value.length;

		// sort the array			
	Arrays.sort(value);
	
	//Declare the empty list
	List<String> company=new ArrayList<String>();

		for (int i = 0; i < len; i++) {
			company.add(value[i]);
		}
		
		//print the list
		System.out.println(company);
		//for-->index based iteration
		for (int i = 0; i < company.size(); i++) {
			//System.out.println(company.get(i));
		}
		
		//foreach--> element based iteration
		for (String string : value) {
			System.out.println(string);
		}
		
		
		
		
		
		
}
}
