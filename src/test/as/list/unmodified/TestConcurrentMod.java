package test.as.list.unmodified;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestConcurrentMod {
	
	private static List<String> setUpFixture() throws Exception {
		List<String> list = new ArrayList<String>();
		
		list.add("one");
		list.add("two");
		list.add("three");
		
		return list;
	}
	
	public static void main(String ... args) throws Exception {
		List<String> list = setUpFixture();
		
		//List<String> copyList = new ArrayList<String>(list);
		List<String> copyList = Collections.synchronizedList(list);
		
		Iterator<String> itr = copyList.iterator();
		
		String one = itr.next();
		System.out.println("First List Element: " + one);
		
		list.add("four");
		
		String two = itr.next();
		System.out.println("Second List Element: " + two);
		System.out.println("List Size: " + copyList.size());
		
		System.out.println(list);
	}
	
}
