import java.util.HashMap;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {
        HashMap<String, Double> studentGrades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nStudent Grade Tracker");
            System.out.println("1. Add Student and Grade");
            System.out.println("2. Update Student Grade");
            System.out.println("3. View All Students and Grades");
            System.out.println("4. Search for a Student's Grade");
            System.out.println("5. Delete Student Record");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    // Add a student and grade
                    System.out.print("Enter Student Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Grade: ");
                    double grade = scanner.nextDouble();
                    studentGrades.put(name, grade);
                    System.out.println("Student and grade added.");
                    break;

                case 2:
                    // Update a student's grade
                    System.out.print("Enter Student Name to Update: ");
                    name = scanner.nextLine();
                    if (studentGrades.containsKey(name)) {
                        System.out.print("Enter New Grade: ");
                        grade = scanner.nextDouble();
                        studentGrades.put(name, grade);
                        System.out.println("Grade updated.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 3:
                    // View all students and grades
                    System.out.println("\nAll Students and Grades:");
                    if (studentGrades.isEmpty()) {
                        System.out.println("No records found.");
                    } else {
                        for (String student : studentGrades.keySet()) {
                            System.out.println("Student: " + student + ", Grade: " + studentGrades.get(student));
                        }
                    }
                    break;

                case 4:
                    // Search for a student's grade
                    System.out.print("Enter Student Name to Search: ");
                    name = scanner.nextLine();
                    if (studentGrades.containsKey(name)) {
                        System.out.println("Student: " + name + ", Grade: " + studentGrades.get(name));
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 5:
                    // Delete a student record
                    System.out.print("Enter Student Name to Delete: ");
                    name = scanner.nextLine();
                    if (studentGrades.containsKey(name)) {
                        studentGrades.remove(name);
                        System.out.println("Student record deleted.");
                    } else {
                        System.out.println("Student not found.");
                    }
                    break;

                case 6:
                    // Exit the program
                    System.out.println("Exiting program. Goodbye!");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}
