import java.util.Scanner;

public class SemesterGPA {
    public static void calculateSemesterGPA(Scanner scanner) {
        int totalCredits = 0;
        double totalWeightedGPA = 0.0;
        double totalGradePoints = 0.0;

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nSubject " + i + ":");
            System.out.print("Enter the grade (out of 100): ");
            int grade = scanner.nextInt();
            System.out.print("Enter the credits/weight for this subject: ");
            int credits = scanner.nextInt();

            double GPA_4Scale = grade / 25.0;

            double weightedGPA = GPA_4Scale * credits;

            totalCredits += credits;
            totalWeightedGPA += weightedGPA;

            totalGradePoints += (grade * credits);
        }

        double overallGPA_4Scale = totalWeightedGPA / totalCredits;

        double overallGPA_100Scale = totalGradePoints / totalCredits;

        // Display overall GPAs
        System.out.printf("\nOverall GPA on a 4.0 scale: %.2f\n", overallGPA_4Scale);
        System.out.printf("Overall GPA on a 100-point scale: %.2f\n", overallGPA_100Scale);
    }
}
