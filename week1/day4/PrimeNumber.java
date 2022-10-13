package week1.day4;

public class PrimeNumber {
	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input=13;
		// Declare a boolean variable flag as false
		boolean flag=false;
     	// Iterate from 2 to half of the input
		for (int i = 2; i <input; i++) {
		// Divide the input with each for loop variable and check the remainder
			if(i%input==0) {
			// Set the flag as true when there is no remainder
				flag=true;
				// break the iterator
				break;
			}
		}
		// Check the flag (Provide a condition)
		if(!flag) {
			System.out.println("The given number is prime");
		}else {
				// Print 'Prime' when the condition matches
		System.out.println("The given number is not prime");
		}
				// Print 'Not a Prime' when the condition doesn't match 
    	
    	
		
	}
}
