package week2.day2;

public class Palindrome {
public static void main(String[] args) {
	 //a) Declare A String value as"madam"
	String value ="madam";
//b) Declare another String rev value as ""
	String rev="";
	//c) Add the char into rev
	char[] charArray=value.toCharArray();
	
   //c) Iterate over the String in reverse order
   for (int i =charArray.length-1;i>=0; i--) {
	rev=rev+charArray[i];
//	System.out.println(rev);
}

// e) Compare the original String with the reversed String, if it is same then print palinDrome 
 //Hint: Use .equals or .equalsIgnoreCase when you compare a String 

   if(rev.equals(value)) {
	 System.out.println("Given String is Palindrome");
 }else {
	 System.out.println("Given String is not Palindrome");
 }
   
}
}
