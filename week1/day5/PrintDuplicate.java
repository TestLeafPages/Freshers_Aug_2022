package week1.day5;

import java.util.Arrays;

public class PrintDuplicate {
	public static void main(String[] args) {
		// Here is the input
		int[] data = {3,2,11,4,6,7};


		/*
				 Pseudo Code:
				 1) Arrange the array in ascending order
				 2) Pick the 2nd element from the last and print it
		 */
Arrays.sort(data);
System.out.println(Arrays.toString(data));
System.out.println(data[data.length-2]);




	}
}
