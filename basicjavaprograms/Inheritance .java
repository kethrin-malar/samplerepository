class Animal {
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}
class Dog extends Animal {
    public void display() {
    System.out.println("My name is " + name);
  }
}

class Inheritance {
  public static void main(String[] args) {
  Dog instance1 = new Dog();
  instance1.name = "Rohu";
    instance1.display();
    instance1.eat();

  }
}
