import java.util.Scanner;

public class StudentGrade2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[][] marks = new double[n][3];
        double[] percentage = new double[n];
        char[] grade = new char[n];
        String[] subjects = {"Physics", "Chemistry", "Maths"};

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            boolean valid = true;
            for (int j = 0; j < 3; j++) {
                System.out.print("  " + subjects[j] + ": ");
                marks[i][j] = sc.nextDouble();
                if (marks[i][j] < 0) {
                    System.out.println("Marks cannot be negative. Enter again.");
                    valid = false;
                    break;
                }
            }
            if (!valid) {
                i--;
                continue;
            }

            percentage[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;

            if (percentage[i] >= 80) grade[i] = 'A';
            else if (percentage[i] >= 70) grade[i] = 'B';
            else if (percentage[i] >= 60) grade[i] = 'C';
            else if (percentage[i] >= 50) grade[i] = 'D';
            else if (percentage[i] >= 40) grade[i] = 'E';
            else grade[i] = 'R';
        }

        System.out.println("\nStudent | Physics | Chemistry | Maths | Percentage | Grade");
        for (int i = 0; i < n; i++)
            System.out.printf("%-8d| %-8.1f| %-10.1f| %-6.1f| %-11.2f| %c%n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2], percentage[i], grade[i]);

        sc.close();
    }
}
