class AgeException extends Exception {
    public AgeException(String msg) {
        super(msg);
    }
}

public class CustomExceptionTest {
    static void checkAge(int age) throws AgeException {
        if (age < 18) {
            throw new AgeException("Age must be 18+");
        }
        System.out.println("Eligible to vote");
    }

    public static void main(String[] args) {
        try {
            checkAge(16);
        } catch (AgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
