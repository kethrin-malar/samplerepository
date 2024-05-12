package keywordproblems;



public class MultithreadingScenario2 {
        class Student {
        private  String name;	
        //private static String name; // static variable

        // Constructor to set the name
        public Student(String name) {
            this.name = name;
        }

        // Method to get the name
        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        
        MultithreadingScenario2 obj = new MultithreadingScenario2();
        Student s1 = obj.new Student("Reena");
        Student s2 = obj.new Student("Malar");
        Student s3 = obj.new Student("Pratheeksha");

        // Creating threads with Runnable implementation
        Thread thread1 = new Thread(new Runnable() {
            
            public void run() {
                System.out.println("Thread 1: " + s1.getName());
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            
            public void run() {
                System.out.println("Thread 2: " + s2.getName());
            }
        });

        Thread thread3 = new Thread(new Runnable() {
            
            public void run() {
                System.out.println("Thread 3: " + s3.getName());
            }
        });

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
