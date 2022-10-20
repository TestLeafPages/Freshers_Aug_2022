package week2.day2;

public class ReverseEvenWords {
	public static void main(String[] args) {

		// Declare the input as Follow
		String test = "I am a software tester"; 
		//a) split the words and have it in an array
		String[] split=test.split(" ");
		//b) Traverse through each word (using loop)
		for (int i = 0; i < split.length; i++) {
			//c) find the odd index within the loop (use mod operator)
			if(i%2!=0) {
				//e)print the even position words in reverse order using another loop (nested loop)
				//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).

				char[] charArray = split[i].toCharArray();
				for (int j =charArray.length-1;j>=0; j--) {

					System.out.print(charArray[j]);
				}

			}
			else {
				System.out.print(" ");
				System.out.print(split[i]+" ");
			}
		}





	}
}
