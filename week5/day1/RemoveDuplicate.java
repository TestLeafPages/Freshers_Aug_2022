package week5.day1;

import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
public static void main(String[] args) {
	int[] num= {5,1,3,6,8,2,5,2,3,4,1};
	//output 1,2,3,4,5,6,8
	
	Set<Integer> uniqueNumber=new TreeSet<Integer>();	
	
	for (int i = 0; i < num.length; i++) {
		if(!uniqueNumber.add(num[i])) {
			System.out.println("Print Duplicate"+num[i]);
		}
		
	}
	for (int j = 0; j< num.length; j++) {
		uniqueNumber.add(num[j]);
			
		}
	System.out.println("Unique Number"+uniqueNumber);
	
//	System.out.println(uniqueNumber);
	
	
}
}
