package week1.day4;

import java.util.Arrays;

public class AcendingOrder {
public static void main(String[] args) {
	int[] numbers={12,15,16,11,14,13};
	
	Arrays.sort(numbers);
	for (int i = 0; i < numbers.length; i++) {
		System.out.println(numbers[i]);
	}
	
	for (int i =numbers.length-1;i>=0; i--) {
		System.out.println(numbers[i]);
	}
	

}
}
