public class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic error!");
        } catch (Exception e) {
            System.out.println("Generic exception");
        }
    }
}
