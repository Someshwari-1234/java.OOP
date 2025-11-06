interface Vehicle {
    void start();  // abstract method
    void stop();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car starts with key");
    }

    public void stop() {
        System.out.println("Car stops with brake");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike starts with self-start");
    }

    public void stop() {
        System.out.println("Bike stops with disc brake");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle v = new Car();
        v.start();
        v.stop();
    }
}
