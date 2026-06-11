import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] physics = new double[n];
        double[] chemistry = new double[n];
        double[] maths = new double[n];
        double[] percentage = new double[n];
        char[] grade = new char[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");
            System.out.print("  Physics: ");
            physics[i] = sc.nextDouble();
            System.out.print("  Chemistry: ");
            chemistry[i] = sc.nextDouble();
            System.out.print("  Maths: ");
            maths[i] = sc.nextDouble();

            if (physics[i] < 0 || chemistry[i] < 0 || maths[i] < 0) {
                System.out.println("Marks cannot be negative. Enter again.");
                i--;
                continue;
            }

            percentage[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;

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
                    (i + 1), physics[i], chemistry[i], maths[i], percentage[i], grade[i]);

        sc.close();
    }
}
