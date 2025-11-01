class Display {
    // Method 1
    void show(int num) {
        System.out.println("Integer: " + num);
    }

    // Method 2 (overloaded)
    void show(String text) {
        System.out.println("String: " + text);
    }
}

public class EarlyBindingExample {
    public static void main(String[] args) {
        Display d = new Display();

        d.show(100);       // Compiler decides to call show(int)
        d.show("Someshwari"); // Compiler decides to call show(String)
    }
}
