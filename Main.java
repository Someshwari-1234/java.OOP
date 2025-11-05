class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void work() {
        System.out.println(name + " is working.");
    }

    void showDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name       : " + name);
        System.out.println("Salary     : " + salary);
    }
}

// Manager IS-A Employee
class Manager extends Employee {
    int teamSize;

    Manager(String name, int id, double salary, int teamSize) {
        super(name, id, salary); // calling parent constructor
        this.teamSize = teamSize;
    }

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting with " + teamSize + " team members.");
    }
}

public class Main {
    public static void main(String[] args) {

        Manager m = new Manager("Someshwari", 101, 50000, 8);

        m.showDetails();       // inherited from Employee
        m.work();              // inherited from Employee
        m.conductMeeting();    // Manager's own method
    }
}
