package test.classname;

import java.util.ArrayList;
import java.util.List;

public class TestClassName {

	public static void main(String ... args) throws Exception {
		System.out.println(new TestClassName().getClass().getName());
		
		List<String> testList = new ArrayList<String>();
		
		testList.add("testA");
		testList.add("testB");
		
		System.out.println(testList);
		
	}
	
}
