class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int id, String programmingLanguage) {
        super(name, id);
        this.programmingLanguage = programmingLanguage;
    }

    void showDeveloperDetails() {
        showEmployeeDetails();
        System.out.println("Specialization: " + programmingLanguage);
    }
}
class Tester extends Employee {
    String testingTool;

    Tester(String name, int id, String testingTool) {
        super(name, id);
        this.testingTool = testingTool;
    }

    void showTesterDetails() {
        showEmployeeDetails();
        System.out.println("Testing Tool: " + testingTool);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Developer dev = new Developer("Rohan", 101, "Java");
        Tester tester = new Tester("Priya", 102, "Selenium");

        dev.showDeveloperDetails();
        System.out.println("----------------");
        tester.showTesterDetails();
    }
}
