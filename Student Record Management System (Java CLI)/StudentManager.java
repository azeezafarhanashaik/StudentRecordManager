import java.util.ArrayList;
import java.util.Iterator;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, int rollNumber, String course) {
        students.add(new Student(name, rollNumber, course));
        System.out.println("✅ Student added successfully!\n");
    }

    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("⚠️ No students found.\n");
            return;
        }
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println();
    }

    public void searchStudent(int rollNumber) {
        boolean found = false;
        for (Student s : students) {
            if (s.getRollNumber() == rollNumber) {
                System.out.println("🔍 Found: " + s + "\n");
                found = true;
                break;
            }
        }
        if (!found) System.out.println("❌ Student not found.\n");
    }

    public void deleteStudent(int rollNumber) {
        Iterator<Student> iterator = students.iterator();
        boolean removed = false;
        while (iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getRollNumber() == rollNumber) {
                iterator.remove();
                removed = true;
                System.out.println("🗑️ Student deleted successfully.\n");
                break;
            }
        }
        if (!removed) System.out.println("❌ Student not found.\n");
    }
}
