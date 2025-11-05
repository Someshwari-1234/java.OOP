class Employee {
    String name;
    double salary;

    void work() {
        System.out.println(name + " is working.");
    }
}

class Manager extends Employee {   // Manager IS-A Employee
    int teamSize;

    void conductMeeting() {
        System.out.println(name + " is conducting a meeting with " + teamSize + " team members.");
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();
        m.name = "Someshwari";
        m
