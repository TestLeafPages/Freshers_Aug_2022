package week1.day3;

public class Print10Table {
	/* goal : to print  10th-Table
	 * initialize the temp variable
	 * iterate the loop from 1 to 10
	 * to multiply with iterate values
	 * the finally print the output
	
	*/
public static void main(String[] args) {
	int a=10;
	int b=1;
	for (int i = 1; i <=a; i++) {
		b=a*i;
		System.out.println(i+"*"+a+"="+b);
	}
}
}
