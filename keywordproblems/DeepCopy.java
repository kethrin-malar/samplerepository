package keywordproblems;

public class DeepCopy {
	String name;
	int age;

	DeepCopy(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// Copy constructor for deep copy
	DeepCopy(DeepCopy original) {
		this.name = original.name;
		this.age = original.age;
	}

	public static void main(String[] args) {
		DeepCopy person1 = new DeepCopy("Alice", 30);

		// Deep copy using copy constructor
		DeepCopy person2 = new DeepCopy(person1); // Deep copy, person2 is a new instance

		// Modifying person2 doesn't affect person1
		person2.name = "Bob";

		System.out.println(person1.name); // Outputs: Alice
		System.out.println(person2.name); // Outputs: Bob
	}
}
