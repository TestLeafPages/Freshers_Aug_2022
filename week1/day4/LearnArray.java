package week1.day4;

public class LearnArray {
public static void main(String[] args) {
	int[] num= {1,2,3,4,5,6};
	
	int length = num.length;
	System.out.println(length);
	for (int i = 0; i < num.length; i++) {
		System.out.println(num[i]);
	}
	
	for (int i =num.length-1;i>=0 ;i--) {
		System.out.println(num[i]);
	}

}
}
