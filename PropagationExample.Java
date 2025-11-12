public class PropagationExample {

    void m() {
        int a = 10 / 0; // Exception here
    }

    void n() {
        m(); // passed to n()
    }

    void p() {
        try {
            n(); // caught here
        } catch (Exception e) {
            System.out.println("Exception handled");
        }
    }

    public static void main(String[] args) {
        new PropagationExample().p();
    }
}
