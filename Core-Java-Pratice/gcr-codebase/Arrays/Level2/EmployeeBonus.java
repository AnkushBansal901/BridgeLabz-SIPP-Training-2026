import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] salary = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salary[i] = sc.nextDouble();
            if (salary[i] <= 0) {
                System.out.println("Invalid salary. Enter again.");
                i--;
                continue;
            }
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = sc.nextDouble();
            if (yearsOfService[i] < 0) {
                System.out.println("Invalid years of service. Enter again.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            double rate = yearsOfService[i] > 5 ? 0.05 : 0.02;
            bonus[i] = salary[i] * rate;
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\n--- Employee Bonus Report ---");
        for (int i = 0; i < 10; i++)
            System.out.println("Employee " + (i + 1) + " | Old Salary: " + salary[i] + " | Bonus: " + bonus[i] + " | New Salary: " + newSalary[i]);

        System.out.println("\nTotal Old Salary: " + totalOldSalary);
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}
