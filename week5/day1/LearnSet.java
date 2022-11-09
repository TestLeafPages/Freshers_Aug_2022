package week5.day1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
public static void main(String[] args) {
	
	Set<String> name=new LinkedHashSet<String>();
	name.add("Praveen");
	name.add("pandi");
	boolean add = name.add("Mani");
	System.out.println(add);
	name.add("deva");
	boolean add2 = name.add("mani");
	System.out.println(add2);
	
	//TreeSet[Mani, Praveen, deva, mani, pandi]
	//hashSet[deva, pandi, Mani, mani, Praveen]
	//linkedhashset[Praveen, pandi, Mani, deva, mani]
	//conver set into list
	List<String> obj=new ArrayList<String>(name);
	System.out.println("List"+obj);

	System.out.println(name);
	
}
}
