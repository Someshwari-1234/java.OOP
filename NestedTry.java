public class NestedTry {
    public static void main(String[] args) {
        try {
            try {
                int arr[] = {1, 2, 3};
                System.out.println(arr[5]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: " + e);
            }
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Outer catch: " + e);
        }
    }
}
