package week1.day2;

public class Calculator {

	public int addTwoNumbers(int a,int b) {
		int c=a+b;
		//System.out.println(c);
		
		return c;
	}
public void subractTwoNumbers(int addTwoNumbers,int b) {
		
		int c=addTwoNumbers-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator calc=new Calculator();
		int addTwoNumbers = calc.addTwoNumbers(20, 20);
		System.out.println(addTwoNumbers);
	calc.subractTwoNumbers(addTwoNumbers, 10);
	}
}
