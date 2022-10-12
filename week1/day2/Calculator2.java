package week1.day2;

public class Calculator2 {

	public int addTwoNumbers(int a, int b) {
		int c=a+b;  
		return c;
	}
	public void subractTwoNumbers(int addTwoNumbers, int b) {
		int e=addTwoNumbers -b;
		System.out.println(e);
	}
	public static void main(String[] args) {
		Calculator2 calc=new Calculator2();
		int addTwoNumbers = calc.addTwoNumbers(50, 50);
		System.out.println(addTwoNumbers);
		calc.subractTwoNumbers(addTwoNumbers, 20);
	}
}
