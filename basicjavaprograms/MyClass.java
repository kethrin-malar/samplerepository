public class MyClass {
    public String publicVariable = "This is a public variable.";
    private String privateVariable = "This is a private variable.";
    protected String protectedVariable = "This is a protectedvariable.";
    String defaultVariable = "This is a default variable.";

    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }
    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        // Accessing public members
        System.out.println(myObject.publicVariable);
        myObject.publicMethod();
        System.out.println(myObject.defaultVariable);
        myObject.defaultMethod();
    }
}

       