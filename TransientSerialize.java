import java.io.Serializable;
import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    transient String password;  // will not be saved

    public Employee(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }
}

public class TransientSerialize {
    public static void main(String[] args) throws Exception {
        Employee e = new Employee(1, "Ravi", "secret123");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("emp.ser"));
        oos.writeObject(e);
        oos.close();
    }
}
