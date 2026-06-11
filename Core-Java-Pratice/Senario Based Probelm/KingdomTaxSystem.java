import java.util.Scanner;

public class KingdomTaxSystem {

    static double calculateTax(double income) {
        if (income < 10000) return income * 0.05;
        else if (income <= 50000) return income * 0.15;
        else return income * 0.30;
    }

    static String getBracket(double income) {
        if (income < 10000) return "5% (Below 10K)";
        else if (income <= 50000) return "15% (10K - 50K)";
        else return "30% (Above 50K)";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter citizen's income: ");
        double income = sc.nextDouble();
        System.out.println("Tax Bracket : " + getBracket(income));
        System.out.println("Tax Amount  : " + calculateTax(income));

        
        double[] citizens = new double[10];
        System.out.println("\nEnter incomes of 10 citizens:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Citizen " + (i + 1) + ": ");
            citizens[i] = sc.nextDouble();
        }

        double totalTax = 0;
        System.out.println("\n--- Tax Summary ---");
        for (int i = 0; i < 10; i++) {
            double tax = calculateTax(citizens[i]);
            totalTax += tax;
            System.out.println("Citizen " + (i + 1) + " | Income: " + citizens[i] + " | Bracket: " + getBracket(citizens[i]) + " | Tax: " + tax);
        }
        System.out.println("Total Tax Collected: " + totalTax);

        sc.close();
    }
}
