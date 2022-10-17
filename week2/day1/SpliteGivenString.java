package week2.day1;

public class SpliteGivenString {
	public static void main(String[] args) {
		String words="I like Chicken Briyani";
		String[] split = words.split(" ");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		System.out.println(split.length);
		int count=0;
		for (int i = 0; i < split.length; i++) {
		//	count=count+1;
			count++;
		}
		System.out.println("count "+count);
	}

}
