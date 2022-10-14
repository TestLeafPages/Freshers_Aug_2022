package week1.day5;

import java.util.Arrays;

public class MissingElement3 {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array	
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length-1; i++) {
			// check if the iterator variable is not equal to the array values respectively
           if(arr[i]+1!=arr[i+1]) {
        	   System.out.println(arr[i]+1);
           }
			// print the number

		}

		// once printed break the iteration


	}
}
