import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("File opened successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
