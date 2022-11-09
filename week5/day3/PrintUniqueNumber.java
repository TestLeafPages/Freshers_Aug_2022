package week5.day3;

import java.util.Iterator;

public class PrintUniqueNumber {
public static void main(String[] args) {
	//declare the int Array
	int[] num= {1,2,3,4,5,6,7,2,4,7};
	
	//output:1,2,3,4,5,6,7,
	
	//initialize the value as  count=0
	int count=0;
	//use nested for loop to iterate the values from int Array
	for (int i = 0; i < num.length; i++) {
		for (int j = i+1; j < num.length; j++) {
			//check if the value is duplicate
			if(num[i]==num[j]) {
				//if value is duplicate change another value 1.e 1000
				num[j]=1000;
				count++;
			}
		}
		//check the condition
		if(count<=1 || num[i]!=1000) {
			//print the unique values
			System.out.println(num[i]);
		}
	}
	
	
	
	
	
	
	
	
}
}
