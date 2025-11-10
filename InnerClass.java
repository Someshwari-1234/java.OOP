class Outer {
    private String message = "Hello from Outer";

    class Inner {
        void display() {
            System.out.println(message); 
        }
    }

    public static void InnerClass(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
