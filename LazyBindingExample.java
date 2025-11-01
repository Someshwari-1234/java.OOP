class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class LazyBindingExample {
    public static void main(String[] args) {
        Animal a;

        a = new Dog();  // Upcasting
        a.sound();      // JVM decides at runtime -> Dog's sound()

        a = new Cat();  // Upcasting
        a.sound();      // JVM decides at runtime -> Cat's sound()
    }
}
