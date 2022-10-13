package week1.day4;

public class PrimeNumber2 {
	public static void main(String[] args) {
		int input=13;
		//1%13==0
		//13%13==0
		int count=0;
		for (int i = 1; i <=input; i++) {
			if(input % i==0) {
				//count=count+1;
				count++;
			}
		}
		if(count==2) {
			System.out.println("The given number is prime");
		}else {
			System.out.println("The given number is not prime");
		}
	}
}
