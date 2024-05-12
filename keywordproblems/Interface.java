package keywordproblems;


	// create an interface
	interface Language {
	  void getName(String name);//@functionalInterface only one unimplemented method 
	  
	  default void getUser(String name) {
		  System.out.println("Malar");
		  
	  }
	}

	// class implements interface
	class ProgrammingLanguage implements Language {

	  // implementation of abstract method
	  public void getName(String name) {
	    System.out.println("Programming Language: " + name);
	  }
	}

	public class Interface {
	  public static void main(String[] args) {
	    ProgrammingLanguage language = new ProgrammingLanguage();
	    language.getName("Java");
	  }
	}

