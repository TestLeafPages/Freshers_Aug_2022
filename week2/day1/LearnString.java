package week2.day1;

public class LearnString {
public static void main(String[] args) {
	String text="Test";
	   
	text="Leaf";
	System.out.println(text);
	
	String text1="TestLeaf";
	String text2="TestLeaf";
	
	
	if(text1.equals(text2)) {
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are not equal");
	}
	
	if(text1==text2) {
		System.out.println("Both are equal");
	}else {
		System.out.println("Both are not equal");
	}
	
	
	String name1=new String("Kani");
	String name2=new String("kani");
	boolean equals = name1.equals(name2);
	if(name1.equals(name2)){
		System.out.println("Both String name are equal");
	}else {
		System.out.println("Both String name are not equal");
	}
	if(name1==name2) {
		System.out.println("Both String name are equal");
	}else {
		System.out.println("Both String name are not equal");
	}
	
}
}
