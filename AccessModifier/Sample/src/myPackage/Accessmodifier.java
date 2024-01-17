package myPackage;

public class Accessmodifier {
	 public int publicVar;
	    private int privateVar;
	    protected int protectedVar;
	    int defaultVar; // Package-private (default access modifier)

	    public Accessmodifier() {
	        publicVar = 1;
	        privateVar = 2;
	        protectedVar = 3;
	        defaultVar = 4;
	    }

	    public void publicMethod() {
	        System.out.println("This is a public method");
	    }

	    private void privateMethod() {
	        System.out.println("This is a private method");
	    }

	    protected void protectedMethod() {
	        System.out.println("This is a protected method");
	    }

	    void defaultMethod() {
	        System.out.println("This is a default (package-private) method");
	    }
	    public static void main(String[] args) {
	    Accessmodifier myObject = new Accessmodifier();

        // Accessing members from the same package.
        myObject.publicVar = 10; // OK, publicVar is public.
        // myObject.privateVar = 20; // Error, privateVar is private and not accessible.
        myObject.protectedVar = 30; // OK, protectedVar is accessible because we're in the same package.
        myObject.defaultVar = 40; // OK, defaultVar is package-private, and we're in the same package.

        myObject.publicMethod(); // OK, publicMethod is public.
        // myObject.privateMethod(); // Error, privateMethod is private and not accessible.
        myObject.protectedMethod(); // OK, protectedMethod is accessible because we're in the same package.
        myObject.defaultMethod(); // OK, defaultMethod is package-private, and we're in the same package.
    }
}
	
	class AnotherClassInSamePackage {
		
		public void accessMyClassMembers() {
			
	    	Accessmodifier myObject = new Accessmodifier();

	        // Accessing members from the same package.
	        myObject.publicVar = 10; // OK, publicVar is public.
	        // myObject.privateVar = 20; // Error, privateVar is private and not accessible.
	        myObject.protectedVar = 30; // OK, protectedVar is accessible because we're in the same package.
	        myObject.defaultVar = 40; // OK, defaultVar is package-private, and we're in the same package.

	        myObject.publicMethod(); // OK, publicMethod is public.
	        // myObject.privateMethod(); // Error, privateMethod is private and not accessible.
	        myObject.protectedMethod(); // OK, protectedMethod is accessible because we're in the same package.
	        myObject.defaultMethod(); // OK, defaultMethod is package-private, and we're in the same package.
	    }
	}
			
		