import java.util.*;

class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }
}

class Department {
    String deptName;
    List<Employee> employees;

    Department(String deptName, List<Employee> employees) {
        this.deptName = deptName;
        this.employees = employees;
    }

    void showEmployees() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            System.out.println("Employee: " + e.name);
        }
    }
}

public class AggregationExample {
    public static void main(String[] args) {
        Employee e1 = new Employee("Anita");
        Employee e2 = new Employee("Ravi");

        List<Employee> empList = new ArrayList<>();
        empList.add(e1);
        empList.add(e2);

        Department dept = new Department("IT", empList);
        dept.showEmployees();
    }
}
