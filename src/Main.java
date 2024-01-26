import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose an option:");
        System.out.println("1. Calculate GPA for one semester");
        System.out.println("2. Calculate Cumulative GPA");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            SemesterGPA.calculateSemesterGPA(scanner);
        } else if (choice == 2) {
            CumulativeGPA.calculateCumulativeGPA(scanner);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}