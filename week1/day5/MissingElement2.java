package week1.day5;

public class MissingElement2 {
	public static void main(String[] args) {
		// Here is the input
		int[] arr = {1,2,3,4,7,6,8};
		//missing number is 5
		int sum1=0;
		for (int i = 0; i <=8; i++) {
			sum1=sum1+i;
			System.out.println(sum1);
		}
		
		System.out.println(sum1);//36
		int sum2=0;
		for (int i = 0; i < arr.length; i++) {
			sum2=sum2+arr[i];
			System.out.println(sum2);
		}
		System.out.println(sum2);//31
		int sum3=sum1-sum2;
		System.out.println("Missing Number is "+sum3);

	}
}
