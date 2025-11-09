class Course {
    String courseName;

    Course(String courseName) {
        this.courseName = courseName;
    }

    void showCourse() {
        System.out.println("Course: " + courseName);
    }
}
class OnlineCourse extends Course {
    OnlineCourse(String courseName) {
        super(courseName);
    }

    void showMode() {
        System.out.println("Mode: Online Live Classes");
    }
}
class RecordedCourse extends Course {
    RecordedCourse(String courseName) {
        super(courseName);
    }

    void showMode() {
        System.out.println("Mode: Pre-recorded Video Lectures");
    }
}
interface Certificate {
    void giveCertificate();
}
class AdvanceCourse extends OnlineCourse implements Certificate {

    AdvanceCourse(String courseName) {
        super(courseName);
    }

    public void giveCertificate() {
        System.out.println("Certificate: Provided after final test");
    }

    void showLevel() {
        System.out.println("Level: Advanced");
    }
}
public class HybridInheritance {
    public static void main(String[] args) {
        AdvanceCourse ac = new AdvanceCourse("Java Full Stack");

        ac.showCourse();        // from Course
        ac.showMode();          // from OnlineCourse
        ac.showLevel();         // from AdvanceCourse
        ac.giveCertificate();   // from Certificate Interface
    }
}
