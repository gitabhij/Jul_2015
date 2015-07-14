public class Comparisons {
	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1);
		
		Person p2 = new Person();
		System.out.println(p2);
		
		p1 = p2;
		System.out.println("After p1=p2");
		
		System.out.println(p1);
		System.out.println(p2);
		
		if(p1 == p2)
			System.out.println("P1 and P2 are the same");
		else
			System.out.println("p1 and p2 are different");
		
		
		// Person p1 = new Person();
		// p1.name = "Sam";
		//
		// Person p2 = new Person();
		// p2.name = "Ram";
		//
		//
		// p1 = p2;
		// String p1Name = p1.name;
		//
		// p2.name = "John";
		// System.out.println(p1.name);
		// System.out.println(p2.name);
	}
}