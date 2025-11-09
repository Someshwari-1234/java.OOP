class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void showDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}
class Developer extends Employee {

    String programmingLanguage;

    Developer(String name, int id, String programmingLanguage) {
        super(name, id);  // calling parent constructor
        this.programmingLanguage = programmingLanguage;
    }

    void showDeveloperDetails() {
        showDetails();  // inherited method
        System.out.println("Specialization: " + programmingLanguage);
    }
}
public class SingleLevelInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer("Rahul", 101, "Java");
        dev.showDeveloperDetails();
    }
}
