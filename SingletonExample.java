// Singleton class
class Singleton {
    // Step 1: Create a private static instance of the class
    private static Singleton singleInstance = null;

    // Step 2: Make the constructor private (so no one can create objects)
    private Singleton() {
        System.out.println("Singleton instance created!");
    }

    // Step 3: Provide a public static method to get the instance
    public static Singleton getInstance() {
        if (singleInstance == null) {
            singleInstance = new Singleton();
        }
        return singleInstance;
    }

    // Example method
    public void showMessage() {
        System.out.println("Hello from Singleton instance!");
    }
}

// Main class to test the Singleton
public class SingletonExample {
    public static void main(String[] args) {
        // Try to get multiple instances
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        // Both references point to the same object
        obj1.showMessage();

        System.out.println("obj1 hashcode: " + obj1.hashCode());
        System.out.println("obj2 hashcode: " + obj2.hashCode());

        if (obj1 == obj2) {
            System.out.println("Both objects are the same instance!");
        }
    }
}
