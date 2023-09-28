
public class StackExample {
    private int maxSize;
    private int top;
    private int[] stackArray;

    public StackExample(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
            return;
        }
        stackArray[++top] = value;
        System.out.println("Pushed " + value + " onto the stack.");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1;
        }
        int poppedValue = stackArray[top--];
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot peek.");
            return -1;
        }
        return stackArray[top];
    }

    public static void main(String[] args) {
        StackExample stack = new StackExample(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.peek());

        stack.pop();
        stack.pop();

        System.out.println("after popping: " + stack.peek());
    }
}
