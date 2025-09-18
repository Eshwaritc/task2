import java.util.ArrayList;
import java.util.Scanner;

// Class to represent a Student
class Student {
    private String name;
    private int[] marks;
    private double average;
    private char grade;

    // Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
        calculateAverage();
        assignGrade();
    }

    // Method to calculate average
    private void calculateAverage() {
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        this.average = (double) sum / marks.length;
    }

    // Method to assign grade
    private void assignGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 60) {
            grade = 'C';
        } else if (average >= 40) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.print("Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println("\nAverage: " + average);
        System.out.println("Grade: " + grade);
        System.out.println("-------------------------");
    }
}

// Main class
public class StudentGradeManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            sc.nextLine(); // Consume newline
            System.out.print("Enter student name: ");
            String name = sc.nextLine();

            System.out.print("Enter number of subjects: ");
            int subjects = sc.nextInt();

            int[] marks = new int[subjects];
            for (int j = 0; j < subjects; j++) {
                System.out.print("Enter marks for subject " + (j + 1) + ": ");
                marks[j] = sc.nextInt();
            }

            // Create Student object and add to list
            students.add(new Student(name, marks));
        }

        // Display all students
        System.out.println("\n===== Student Records =====");
        for (Student s : students) {
            s.displayDetails();
        }

        sc.close();
    }
}