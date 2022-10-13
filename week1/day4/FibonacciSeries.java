package week1.day4;

public class FibonacciSeries {
public static void main(String[] args) {

	// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
	int firstNumber=0;
	System.out.println(firstNumber);
	int secondNumber=1;
	System.out.println(secondNumber);
			// Print first number
			int sum=0;
			// Iterate from 1 to the range
     for (int i = 1; i <=8; i++) {
    	// add first and second number assign to sum
      sum=firstNumber+secondNumber;
      System.out.println(sum);
   	// Assign second number to the first number
      firstNumber=secondNumber;
    	// Assign sum to the second number
      secondNumber=sum;
    	// print sum
    				
    				
	    }
			
			
	
	
}
}
