package week1.day5;

import java.util.Arrays;

public class MissingElement {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		// Sort the array	
		Arrays.sort(arr);
		// loop through the array (start i from arr[0] till the length of the array)
		for (int i = 0; i < arr.length-1; i++) {
			int j=i+1;
			if(j!=arr[i]) {
				System.out.println(j);
				break;
           }
			// print the number

		}

		// once printed break the iteration


	}
}
