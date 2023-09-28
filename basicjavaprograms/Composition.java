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
    private Heart heart;

    public Person(String name, int age, Heart heart) {
        this.name = name;
        this.age = age;
        this.heart = heart;
    }

    public void describe() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Heart type: " + heart.heartType);
    }

    public void makeHeartBeat() {
        heart.beat();
    }
}

public class Composition {
    public static void main(String[] args) {
        Heart heart = new Heart("Healthy");
        Person person = new Person("John", 30, heart);

        person.describe();
        person.makeHeartBeat();
    }
}

