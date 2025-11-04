public class NestedFinally {
    public static void main(String[] args) {
        try {
            try {
                System.out.println(10 / 0);
            } finally {
                System.out.println("Inner finally executed");
            }
        } catch (Exception e) {
            System.out.println("Caught: " + e);
        } finally {
            System.out.println("Outer finally executed");
        }
    }
}
