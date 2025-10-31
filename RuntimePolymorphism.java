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

public class RuntimePolymorphism {
    public static void main(String[] args) {
        Animal a; // Reference of parent class

        a = new Dog();
        a.sound(); // Calls Dog's version

        a = new Cat();
        a.sound(); // Calls Cat's version
    }
}
