public class Employee {
    // 🔒 Private data members (data hiding)
    private int empId;
    private String name;
    private double salary;

    // 🧠 Public setter methods (to set data safely)
    public void setEmpId(int empId) {
        if (empId > 0)
            this.empId = empId;
        else
            System.out.println("Invalid Employee ID!");
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty())
            this.name = name;
        else
            System.out.println("Name cannot be empty!");
    }

    public void setSalary(double salary) {
        if (salary >= 0)
            this.salary = salary;
        else
            System.out.println("Salary must be non-negative!");
    }

    // 👁️ Public getter methods (to access data safely)
    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    // Display employee details
    public void showDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }

    // Main method to test encapsulation
    public static void main(String[] args) {
        Employee emp = new Employee();

        // Setting values using setters
        emp.setEmpId(101);
        emp.setName("Someshwari Warwatte");
        emp.setSalary(60000);

        // Getting values using getters
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: ₹" + emp.getSalary());

        // Displaying all details
        emp.showDetails();
    }
}
