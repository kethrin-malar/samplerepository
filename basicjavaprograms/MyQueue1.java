
import java.util.LinkedList;
import java.util.Queue;

class MyQueue {
    private Queue<Integer> queue;

    public MyQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
    }

    public int pop() {
        if (!empty()) {
            return queue.remove();
        } else {
            throw new IllegalStateException("Queue is empty.");
        }
    }

    public int peek() {
        if (!empty()) {
            return queue.peek();
        } else {
            throw new IllegalStateException("Queue is empty.");
        }
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}

public class MyQueue1 {
    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();

        // Input
        Object[] output = new Object[6];
        output[0] = null; // null for the constructor

        myQueue.push(1);
        output[1] = null; // null for the push operation

        myQueue.push(2);
        output[2] = null; // null for the second push operation

        output[3] = myQueue.peek(); // peek returns 1
        output[4] = myQueue.pop(); // pop returns 1

        output[5] = myQueue.empty(); // empty returns false

        // Print the output
        System.out.print("[");
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
            if (i < output.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
