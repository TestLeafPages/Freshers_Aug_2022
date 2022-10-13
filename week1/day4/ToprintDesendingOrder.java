package week1.day4;

import java.util.Arrays;

public class ToprintDesendingOrder {
public static void main(String[] args) {
	int[] number={10,50,40,20,30};
	
	Arrays.sort(number);
	
	System.out.println(Arrays.toString(number));
	for (int i =number.length-1;i>=0; i--) {
		System.out.println(number[i]);
	}
}
}
