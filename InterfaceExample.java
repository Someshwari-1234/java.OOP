interface Vehicle {
    void start();  // abstract method
    void stop();   // abstract method
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car engine started");
    }
    public void stop() {
        System.out.println("Car stopped");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike engine started");
    }
    public void stop() {
        System.out.println("Bike stopped");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();

        v1.start();
        v1.stop();

        v2.start();
        v2.stop();
    }
}
