package linkedlist;

public class Linked {
	public static class Node {
		private String name;
		private Node nextNode;

		// Constructors, getters, and setters for name and nextNode properties
		// ...

		// Getter for the name property
		public String getName() {
			return name;
		}

		// Setter for the name property
		public void setName(String name) {
			this.name = name;
		}

		// Getter for the nextNode property
		public Node getNextNode() {
			return nextNode;
		}

		// Setter for the nextNode property
		public void setNextNode(Node nextNode) {
			this.nextNode = nextNode;
		}
	}
	
	public static void printNodes(Node currNode) {
		while(currNode != null) {
			System.out.println(currNode.getName());
			currNode = currNode.getNextNode();
		}
	}
	
	public static void addNode(String name, Node headNode) {
		Node newNode = new Node();
		newNode.setName(name);
		
		Node currentNode = headNode;
		
		if(currentNode != null) {
			while(currentNode.getNextNode() != null) {
				currentNode = currentNode.getNextNode();
			}
			currentNode.setNextNode(newNode);
		}
	}
	
	public static void deleteNode(String name, Node headNode) {
		Node prevNode = null;
		Node currentNode = headNode;
		
		while (currentNode != null) {
			if (currentNode.getName().equals(name)) {
				// If the node to be deleted is the head node
				if (prevNode == null) {
					headNode = currentNode.getNextNode();
				} else {
					// Update the previous node's nextNode to skip the current node
					prevNode.setNextNode(currentNode.getNextNode());
				}
				// Optional: You may want to release resources for the node being deleted.
				currentNode = null;
				return; // Node found and deleted, exit the method.
			}
			
			// Move to the next node
			prevNode = currentNode;
			currentNode = currentNode.getNextNode();
		}
		
		// If the node is not found, do nothing (optional: you may print a message).
	}
	
	public static void main(String[] args) {
		Node n1 = new Node();
		n1.setName("John");
		
		Node n2 = new Node();
		n2.setName("Lisa");
		
		Node n3 = new Node();
		n3.setName("Smith");
		
		n1.setNextNode(n2);
		n2.setNextNode(n3);
		
		//Varrun is the name
		n1.setName("Varrun");
		
		printNodes(n1);
		addNode("Yuvaraj", n1);
		System.out.println("===========");
		printNodes(n1);
		
		deleteNode("Varrun", n1);
		System.out.println("===========");
		printNodes(n1);
	}

}
