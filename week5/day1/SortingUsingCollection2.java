package week5.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortingUsingCollection2 {
public static void main(String[] args) {
	// Declare a String array and add the Strings values as (Google,Microsoft,TestLeaf,Maverick)		

	String[] value= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
	
	//create a list
	List<String> companyName=new ArrayList<String>();
	
	//iterate the values from StringArray
	for (String variable : value) {
		//System.out.println(variable);
		
		//to Add the values into List
		companyName.add(variable);
	}
	System.out.println(companyName);
		
}
}
