package week2.day3;

public class RemoveDuplicateWords {
public static void main(String[] args) {
	//a) Use the declared String text as input
String text = "We java learn java basics as part of java sessions in java week1";		
//b) Initialize an integer variable as count
int count=0;
// c) Split the String into array and iterate over it 
String[] split = text.split(" ");
//d) Initialize another loop to check whether the word is there in the array
for (int i = 0; i < split.length; i++) {
	for (int j = i+1; j < split.length; j++) {
		if(split[i].equals(split[j])) {
			count++;
			split[j]="";
		}
	}
	//if(count>1 || split[i]!=" ") {
		//System.out.print(split[i]+" ");
	//}
	if(count>1) {
		String replaceAll = split[i].replaceAll(split[i], " ");
		
		System.out.print(replaceAll);
	}
		
}
// e) if it is available then increase and count by 1. 
// f) if the count > 1 then replace the word as "" 

// g) Displaying the String without duplicate words	
}
}
