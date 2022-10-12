package week1.day3;

public class EmployeeDetails {
	public void printEmployeeName(String empName, int empId) {
		System.out.println("empName "+empName+"  "+"empId "+empId);
	}
	public void getEmployeeAddress(String empAddress) {
		System.out.println("empAddress  "+empAddress);
	}
	public void printEmployeeSalary(double empSalary) {
		System.out.println("empSalary "+empSalary);
	}
	public void printEmployeeMobileNumber(long mobNum) {
		System.out.println("mobNum "+mobNum);
	}
	public static void main(String[] args) {
		EmployeeDetails employee=new EmployeeDetails();
		employee.printEmployeeName("Arun", 101);
		employee.getEmployeeAddress("Chennai");
		employee.printEmployeeMobileNumber(997673838L);
		employee.printEmployeeSalary(258.9734);
	}
	
}
