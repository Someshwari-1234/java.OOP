class Person {
    String name;
    int age;
}

class Employee extends Person {
    String company;

    Employee(String name, int age, String company) {
        this.name = name;
        this.age = age;
        this.company = company;
    }

    void display() {
        System.out.println(name + " (Age: " + age + ") works at " + company);
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        Employee emp = new Employee("Someshwari", 22, "Van Heusen");
        emp.display();
    }
}
