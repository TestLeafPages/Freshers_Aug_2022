package week1.day5;

public class FindIntersection {
public static void main(String[] args) {
	
	 //a) Declare An array for {3,2,11,4,6,7};	
	   int[] num1={3,2,11,4,6,7};
	 //b) Declare another array for {1,2,8,4,9,7};
	   int[] num2={1,2,8,4,9,7};
	 // c) Declare for loop iterator from 0 to array length
	   for (int i = 0; i < num1.length; i++) {
		 //d) Declare a nested for another array from 0 to array length
			for (int j = 0; j < num2.length; j++) {
				//f) Print the first array (shoud match item in both arrays)
			 if(num1[i]==num2[j]) {
				 System.out.println(num1[i]);
			 }
			}
	   }
	 
	  
	
}
}
