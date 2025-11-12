public class ThrowThrowsExample {

    static void validate(int marks) throws Exception {
        if (marks < 35) {
            throw new Exception("Failed in exam");
        }
        System.out.println("Passed");
    }

    public static void main(String[] args) {
        try {
            validate(20);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
