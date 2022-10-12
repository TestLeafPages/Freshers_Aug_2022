package week1.day3;

public class PrintOddAndEvenNumber {
	/* goal : to print 1 to 20Even Number
	 iterate the loop from 1 to 20
	 check if the number is even
	 then print the even number
	*/
public static void main(String[] args) {
	for (int i = 1; i <=20; i++) {
		if(i%2!=0) {
			System.out.println("odd number is "+i);
		}
		else {
			System.out.println("Even number is "+i);
		}
	}
}
}
