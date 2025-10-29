// Encapsulation Example
class Student {
    // Private variables (data hiding)
    private String name;
    private int age;
    private String course;

    // Setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter method for name
    public String getName() {
        return name;
    }

    // Setter method for age
    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age must be positive!");
        }
    }

    // Getter method for age
    public int getAge() {
        return age;
    }

    // Setter method for course
    public void setCourse(String course) {
        this.course = course;
    }

    // Getter method for course
    public String getCourse() {
        return course;
    }
}

// Main class to test encapsulation
public class EncapsulationExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // Using setter methods to set values
        s1.setName("Someshwari");
        s1.setAge(21);
        s1.setCourse("Computer Science");

        // Using getter methods to access private data
        System.out.println("Student Details:");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("Course: " + s1.getCourse());
    }
}
