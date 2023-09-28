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
public class Main1 {
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

     }
}


/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */