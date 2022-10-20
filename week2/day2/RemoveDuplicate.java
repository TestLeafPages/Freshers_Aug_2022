package week2.day2;

public class RemoveDuplicate {
public static void main(String[] args) {
	//a) Use the declared String text as input
	String text1 = "We learn java basics as part of java sessions in java week1";
	//b) Initialize an integer variable as count
	int count = 0;
	String temp = "";
	//c) Split the String into array and iterate over it 
	String[] wordsArr = text1.split(" ");
	
	
	for (int i = 0; i < wordsArr.length; i++) {
//d) Initialize another loop to check whether the word is there in the array
		for (int j = i+1; j < wordsArr.length ; j++) {
			
			if (wordsArr[i].equals(wordsArr[j])) {
				temp = wordsArr[i];
				//e) if it is available then increase and count by 1.
				count += 1;
			}
		}
	}
	//f) if the count > 1 then replace the word as "" 
	if (count > 1) {
		//g) Displaying the String without duplicate words	
		System.out.println(text1.replace(temp, ""));
	}
	 

  
 }
    
	
}

