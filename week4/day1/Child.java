package week4.day1;

import java.util.ArrayList;
import java.util.List;

public class Child extends Parent {
public void car() {
	System.out.println("Audi car");

}
public void ecrBungalow() {
	System.out.println("Parent Bungalow");
}
		
public static void main(String[] args) {
	List<String> name=new ArrayList<String>();
	Child child =new Child();
	child.bungalow();
	child.ecrBungalow();
	child.teaEstates();
	child.car();
}
}
