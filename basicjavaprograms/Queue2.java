class Node {
    private String data;
    private Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}

public class Queue2 {
    private Node headNode;

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }
    
    // add method
    public void addNode(String data) {
        Node newNode = new Node(data);
        if (headNode == null) {
            headNode = newNode;
        } else {
            Node current = headNode;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    // New method to insert a node with the specified data after the given key data
    public void insertNode(String newData, String afterData) {
        Node newNode = new Node(newData);
        if (headNode == null) {
            headNode = newNode;
        } else {
            Node current = headNode;
            while (current != null && !current.getData().equals(afterData)) {
                current = current.getNext();
            }
            if (current != null) {
                newNode.setNext(current.getNext());
                current.setNext(newNode);
            } else {
                // If the afterData is not found, append the new node to the end of the queue
                current = headNode;
                while (current.getNext() != null) {
                    current = current.getNext();
                }
                current.setNext(newNode);
            }
        }
    }

   //remove method
   public void removeNode(String dataToRemove) {
        if (headNode == null) {
            return; // Queue is empty, nothing to remove
        }

        // If the node to remove is the headNode, update the headNode to the next node
        if (headNode.getData().equals(dataToRemove)) {
            headNode = headNode.getNext();
            return;
        }

        Node current = headNode;
        Node previous = null;

        // Traverse the queue to find the node to remove
        while (current != null && !current.getData().equals(dataToRemove)) {
            previous = current;
            current = current.getNext();
        }

        // If the node to remove is found, update the previous node's next pointer
        if (current != null) {
            previous.setNext(current.getNext());
        }
    }

    
    //display method
    public void display() {
        Node current = headNode;
        while (current != null) {
            System.out.print(current.getData() + "  ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Queue2 q1 = new Queue2();
        q1.addNode("John");
        q1.addNode("Lisa");
        q1.addNode("ram");
        q1.addNode("abi");
        q1.display();
        // Inserting the node with data "vimal" after "John" if it exists, otherwise, append to the end
        q1.insertNode("vimal", "John");
        q1.display();
        q1.removeNode("ram");
        q1.display();
        
        
    }
}
