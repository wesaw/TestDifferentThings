package test.hierarchy;

public class Test {

	public static void main(String ... args) throws Exception {
		
		Parent parent = new Parent();
		ChildA childA = new ChildA();
		ChildB childB = new ChildB();
		
		System.out.println("Parent: " + parent.test);
		System.out.println("ChildA: " + childA.test);
		System.out.println("ChildB: " + childB.test);
	}
	
}
