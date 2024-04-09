package saravan;

public class Singleton {

	private static Singleton obj = new Singleton();

	private Singleton() {
	}// private constructor within a class don't allow new object

	public static Singleton getInstance() {
		return obj;
	}

	public void doMethod() {
		System.out.println("Doing something...");
	}

	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		obj1.doMethod();
	}
}
