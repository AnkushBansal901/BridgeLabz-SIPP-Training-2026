import java.util.Scanner;

public class BMIProgram2DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons: ");
        int number = sc.nextInt();

        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];

        for (int i = 0; i < number; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            personData[i][0] = sc.nextDouble();
            if (personData[i][0] <= 0) {
                System.out.println("Please enter a positive value.");
                i--;
                continue;
            }
            System.out.print("Enter height (m) of person " + (i + 1) + ": ");
            personData[i][1] = sc.nextDouble();
            if (personData[i][1] <= 0) {
                System.out.println("Please enter a positive value.");
                i--;
            }
        }

        for (int i = 0; i < number; i++) {
            personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            double b = personData[i][2];
            if (b <= 18.4)
                weightStatus[i] = "Underweight";
            else if (b <= 24.9)
                weightStatus[i] = "Normal";
            else if (b <= 39.9)
                weightStatus[i] = "Overweight";
            else
                weightStatus[i] = "Obese";
        }

        System.out.println("\nPerson | Weight | Height | BMI    | Status");
        for (int i = 0; i < number; i++)
            System.out.printf("%-7d| %-7.1f| %-7.2f| %-7.2f| %s%n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);

        sc.close();
    }
}
