package week4.day1;

public class Student {

	public void getStudentDetails(String name) {
     System.out.println(name);
	}
	public void getStudentDetails(int stdId) {
   System.out.println(stdId);
	}
	public void getStudentDetails(String name,int stdId) {
System.out.println("Nmae"+name+" "+"Id"+stdId);
	}
	public void getStudentDetails(int stdId,String name) {

	}
	public static void main(String[] args) {
		
		
		Student std=new Student();
		std.getStudentDetails("Mani");
		std.getStudentDetails(101);
		std.getStudentDetails("Mani", 101);
	}
}
