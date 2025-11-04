public class RethrowExample {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("Caught again in main: " + e.getMessage());
        }
    }

    static void method1() throws Exception {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            throw new Exception("Exception from method1", e);
        }
    }
}
