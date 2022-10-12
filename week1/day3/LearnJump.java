package week1.day3;

public final class LearnJump {
public static void main(String[] args) {
	for (int i = 1; i <10; i++) {
		if(i==5) {
		System.out.println("Five");
		continue;
		//it will skip the current iteration
		}
		System.out.println(i);
	}
}
}
