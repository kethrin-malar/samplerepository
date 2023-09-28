public class AccessModifiers {
    public String publicVariable = "This is a public variable.";
    public void publicMethod() {
        System.out.println("This is a public method.");
    }
}
public class Main {
    public static void main(String[] args) {
        MyClass myObject = new MyClass();
        System.out.println(myObject.publicVariable);
        myObject.publicMethod();
    }
}

