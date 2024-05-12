package keywordproblems;

public class ShallowCopy {
	
	    String name;
	    int age;

	    ShallowCopy(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }
	

	
	    public static void main(String[] args) {
	    	ShallowCopy person1 = new ShallowCopy("Alice", 30);
	        
	        // Shallow copy
	    	ShallowCopy person2 = person1; // Shallow copy, both person1 and person2 reference the same object
	        
	        // Modifying person2 affects person1
	        person2.name = "Bob";
	        
	        System.out.println(person1.name); 
	        System.out.println(person2.name); 
	    }
	}


