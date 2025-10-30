// Engine class cannot exist without Car
class Engine {
    void start() {
        System.out.println("Engine started...");
    }

    void stop() {
        System.out.println("Engine stopped.");
    }
}

// Car class has an Engine — composition
class Car {
    private Engine engine; // Engine is part of Car

    Car() {
        engine = new Engine(); // Engine created inside Car
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }

    void stopCar() {
        engine.stop();
        System.out.println("Car is stopped.");
    }
}

// Main class
public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
        car.stopCar();
    }
}
