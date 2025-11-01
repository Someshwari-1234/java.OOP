class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("Dog is eating bones...");
    }

    void bark() {
        System.out.println("Dog is barking...");
    }
}

public class DowncastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object is referred by Animal reference
        Animal a = new Dog();

        a.eat();  // Runtime polymorphism — calls Dog's version

        // Downcasting: converting Animal reference back to Dog
        Dog d = (Dog) a;
        d.bark(); // Now we can call Dog-specific method
    }
}
