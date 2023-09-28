
import java.util.Stack;

public class SimpleStackExample {
    public static void main(String[] args) {
        
        Stack stack1 = new Stack();
        stack1.push(10);
        stack1.push(20);
        stack1.push(30);
        stack1.push();
        System.out.println("Top element: " + stack1.peek());
        System.out.println("Popped: " + stack1.pop());
        System.out.println("Popped: " + stack1.pop());

        
        System.out.println("Top element after popping: " + stack1.peek());
    }
}