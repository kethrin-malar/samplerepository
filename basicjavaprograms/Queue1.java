public class Queue1 {
    private Node headNode;

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public void addNode(String name) {
        Node newNode = new Node(name);
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

    public void removeNode() {
        if (headNode != null) {
            headNode = headNode.getNext();
        }
    }

    public void insert(String name) {
        Node newNode = new Node(name);
        newNode.setNext(headNode);
        headNode = newNode;
    }

    public void insertAtMiddle(String name) {
        if (headNode == null) {
            insert(name); // If the queue is empty, insert at the front
            return;
        }

        // Find the middle position
        int size = 0;
        Node current = headNode;
        while (current != null) {
            current = current.getNext();
            size++;
        }

        int middle = size / 2;

        // Create a new node with the given name
        Node newNode = new Node(name);

        // Traverse to the middle position
        current = headNode;
        for (int i = 0; i < middle - 1; i++) {
            current = current.getNext();
        }

        // Insert the new node at the middle position
        newNode.setNext(current.getNext());
        current.setNext(newNode);
    }

    public void printNodes() {
        Node current = headNode;
        System.out.println("Nodes in the queue:");
        while (current != null) {
            System.out.println(current.getName());
            current = current.getNext();
        }
    }

    public static void main(String[] args) {
        Queue1 q1 = new Queue1();
        q1.addNode("John");
        q1.addNode("Lisa");
        q1.printNodes();

        q1.insertAtMiddle("Mike");
        q1.printNodes();
    }

}    