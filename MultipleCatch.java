public class MultipleCatch {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length()); // NullPointerException
        } 
        catch (ArithmeticException e) {
            System.out.println("Arithmetic error");
        } 
        catch (NullPointerException e) {
            System.out.println("Null value found");
        }
    }
}
