package keywordproblems;

public class Constructorprivate {
	int id;
	String name;
	int age;

	// creating two arg constructor
	private Constructorprivate(int i, String n) {
		id = i;
		name = n;
	}

	/*
	 * class B{ int id; String name;
	 * 
	 * private B(int j, String n1) { id = j; name = n1;
	 * 
	 * } }
	 */
	void display() {
		System.out.println(id + " " + name + " " + age);
	}
	/*
	 * void dis(){ System.out.println(id+" "+name); }
	 */

	public static void main(String args[]) {
		Constructorprivate s1 = new Constructorprivate(111, "Karan");
		// B s2 = new B();
		s1.display();

	}
}
