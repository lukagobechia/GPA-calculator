import java.util.Scanner;

public class CumulativeGPA {
    public static void calculateCumulativeGPA(Scanner scanner) {
        double totalCumulativeWeightedGPA = 0.0;
        int totalCumulativeCredits = 0;
        double totalCumulativeGradePoints = 0.0;

        System.out.print("Enter the number of semesters: ");
        int numSemesters = scanner.nextInt();

        for (int semester = 1; semester <= numSemesters; semester++) {
            System.out.println("\nSemester " + semester + ":");

            int totalSemesterCredits = 0;
            double totalSemesterWeightedGPA = 0.0;
            double totalSemesterGradePoints = 0.0;

            System.out.print("Enter the number of subjects for this semester: ");
            int numSubjects = scanner.nextInt();

            for (int i = 1; i <= numSubjects; i++) {
                System.out.println("\nSubject " + i + ":");
                System.out.print("Enter the grade (out of 100) for this subject: ");
                int grade = scanner.nextInt();
                System.out.print("Enter the credits for this subject: ");
                int credits = scanner.nextInt();

                double GPA_4Scale = grade / 25.0;

                double weightedGPA = GPA_4Scale * credits;

                totalSemesterCredits += credits;
                totalSemesterWeightedGPA += weightedGPA;

                totalSemesterGradePoints += (grade * credits);
            }

            double semesterGPA_4Scale = totalSemesterWeightedGPA / totalSemesterCredits;

            totalCumulativeCredits += totalSemesterCredits;
            totalCumulativeWeightedGPA += totalSemesterWeightedGPA;

            totalCumulativeGradePoints += totalSemesterGradePoints;

            System.out.println("Semester GPA on a 4.0 scale: " + semesterGPA_4Scale);
        }

        double cumulativeGPA_4Scale = totalCumulativeWeightedGPA / totalCumulativeCredits;

        double cumulativeGPA_100Scale = totalCumulativeGradePoints / totalCumulativeCredits;

        System.out.printf("\nCumulative GPA on a 4.0 scale: %.2f\n", cumulativeGPA_4Scale);
        System.out.printf("Cumulative GPA on a 100-point scale: %.2f\n", cumulativeGPA_100Scale);

    }
}
