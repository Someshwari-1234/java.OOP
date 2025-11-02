// Abstract class
abstract class Shape {
    // Abstract method (no body)
    abstract void draw();

    // Concrete method (has body)
    void message() {
        System.out.println("Drawing a shape...");
    }
}

// Concrete subclasses
class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Shape s1 = new Circle();    // upcasting
        Shape s2 = new Rectangle(); // upcasting

        s1.message();
        s1.draw();

        s2.message();
        s2.draw();
    }
}
