class Heart {
    private String heartType;

    public Heart(String heartType) {
        this.heartType = heartType;
    }

    public void beat() {
        System.out.println("Heart is beating...");
    }
}

class Person {
    private String name;
    private int age;
    //private Heart heart;
    private Heart heart = new Heart("Healthy");


    public Person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void describe() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);

    }

    public void makeHeartBeat() {
        heart.beat();
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        //Heart heart = new Heart("Healthy");
        Person p1= new Person("John", 30);

        p1.describe();
        p1.makeHeartBeat();
    }
}

