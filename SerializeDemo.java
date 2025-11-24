import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeDemo {
    public static void main(String[] args) {
        try {
            Student s = new Student(1, "Rahul");

            FileOutputStream fos = new FileOutputStream("student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s);
            oos.close();
            fos.close();

            System.out.println("Object Serialized Successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
