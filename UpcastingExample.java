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

public class UpcastingExample {
    public static void main(String[] args) {
        // Upcasting: Dog object is referred by Animal reference
        Animal a = new Dog();

        a.eat(); // Calls Dog's overridden method (runtime polymorphism)
        // a.bark(); ❌ Not allowed, because 'a' is of type Animal

        // To access bark(), we need to downcast
        Dog d = (Dog) a;
        d.bark();
    }
}
