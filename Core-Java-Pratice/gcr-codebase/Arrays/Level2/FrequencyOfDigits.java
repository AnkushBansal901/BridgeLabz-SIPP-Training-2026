import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = Math.abs(sc.nextInt());

        int temp = number, digitCount = 0;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        int[] digits = new int[digitCount];
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        int[] frequency = new int[10];
        for (int i = 0; i < digitCount; i++)
            frequency[digits[i]]++;

        System.out.println("Digit frequencies in " + number + ":");
        for (int i = 0; i <= 9; i++)
            if (frequency[i] > 0)
                System.out.println("Digit " + i + ": " + frequency[i] + " time(s)");

        sc.close();
    }
}
