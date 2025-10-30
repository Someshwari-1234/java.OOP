// Association Example
class Teacher {
    String name;

    Teacher(String name) {
        this.name = name;
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void learnFrom(Teacher teacher) {
        System.out.println(name + " is learning from " + teacher.name);
    }
}

public class AssociationExample {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Mr. Sharma");
        Student s1 = new Student("Someshwari");

        s1.learnFrom(t1); // Association relationship
    }
}
