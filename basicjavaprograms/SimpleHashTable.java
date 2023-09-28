import java.util.HashMap;

public class SimpleHashTable {
    public static void main(String[] args) {
        // Create a new hashtable
        HashMap<String, Integer> hashtable = new HashMap<>();

        // Insert elements into the hashtable
        hashtable.put("apple", 5);
        hashtable.put("banana", 10);
        hashtable.put("orange", 15);

        // Retrieve and print values
        System.out.println("Value of 'apple': " + hashtable.get("apple"));     // Output: Value of 'apple': 5
        System.out.println("Value of 'banana': " + hashtable.get("banana"));   // Output: Value of 'banana': 10
        System.out.println("Value of 'orange': " + hashtable.get("orange"));   // Output: Value of 'orange': 15

        // Update an existing value
        hashtable.put("banana", 20);
        System.out.println("Updated value of 'banana': " + hashtable.get("banana"));   // Output: Updated value of 'banana': 20

        // Remove an element
        hashtable.remove("apple");
        System.out.println("Value of 'apple' after removal: " + hashtable.get("apple")); // Output: Value of 'apple' after removal: null
    }
}
