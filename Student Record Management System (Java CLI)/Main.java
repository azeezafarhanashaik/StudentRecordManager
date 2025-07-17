import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner sc = new Scanner(System.in);
        int choice;

        System.out.println("🎓 Welcome to Student Record Management System");

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Roll Number: ");
                    int roll = sc.nextInt();
                    sc.nextLine(); // consume newline
                    System.out.print("Enter Course: ");
                    String course = sc.nextLine();
                    manager.addStudent(name, roll, course);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter Roll Number to Search: ");
                    int searchRoll = sc.nextInt();
                    manager.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.print("Enter Roll Number to Delete: ");
                    int deleteRoll = sc.nextInt();
                    manager.deleteStudent(deleteRoll);
                    break;

                case 5:
                    System.out.println("👋 Exiting... Thank you!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice. Please try again.");
            }

        } while (choice != 5);

        sc.close();
    }
}
