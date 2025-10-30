class Engine {
    void start() {
        System.out.println("Engine started.");
    }
}

class Car {
    private Engine engine;

    Car() {
        engine = new Engine(); // Engine created inside Car (strong ownership)
    }

    void startCar() {
        engine.start();
        System.out.println("Car is running...");
    }
}

public class CompositionExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.startCar();
    }
}
