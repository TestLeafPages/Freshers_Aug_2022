package week2.day1;

public class CharOccurance {
	public static void main(String[] args) {
		// Check number of occurrences of a char (eg 'e') in a String

		String str = "welcome to chennai";

//output =3;
//Convert the String into CharArray
char[] charArray=str.toCharArray();
//Initialize the count variable
int count=0;

//get the length of the CharArray
int len=charArray.length;

//iterate the loop from 0 to charArray length
for(int i=0;i<len;i++){
//if condition the condition is matched to increase the count
if(charArray[i]=='e'){
count++;
}
}
System.out.println(count);

	}
}
