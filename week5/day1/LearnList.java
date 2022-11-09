package week5.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	
	List<String> name=new ArrayList<String>();
	
	boolean empty = name.isEmpty();
	System.out.println(empty);
	
	name.add("Praveen");
	name.add("pandi");
	name.add("Mani");
	name.add("deva");
	
	System.out.println(name);
	
	name.add("Praveen");
	System.out.println(name);
	name.add(0, "Arun");
	System.out.println(name);
	
	System.out.println(name.size());
	
	String string = name.get(0);
	System.out.println(string);
	//to remove particular index
   name.remove(0);
   System.out.println(name);
	//to remove using object
   name.remove("Mani");
   System.out.println(name);
   
   boolean contains = name.contains("deva");
   System.out.println(contains);
	
   Collections.sort(name);
   System.out.println(name);
   
   
   Collections.reverse(name);
   System.out.println(name);
   
   name.clear();
   System.out.println(name.isEmpty());
   
   
   for (int i = 0; i < name.size(); i++) {
	
	System.out.println(name.get(i));
}
   
   
   
	
}
}
