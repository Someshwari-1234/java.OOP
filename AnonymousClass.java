interface Greeting {
    void sayHello();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello from Anonymous Class!");
            }
        };

        g.sayHello();
    }
}
