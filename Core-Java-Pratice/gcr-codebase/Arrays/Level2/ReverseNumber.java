import java.util.Scanner;

public class ReverseNumber {
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
        for (int i = 0; i < digitCount; i++) {
            digits[i] = number % 10;
            number /= 10;
        }

        int[] reversed = new int[digitCount];
        for (int i = 0; i < digitCount; i++)
            reversed[i] = digits[digitCount - 1 - i];

        System.out.print("Reversed number: ");
        for (int i = 0; i < digitCount; i++)
            System.out.print(reversed[i]);
        System.out.println();
        sc.close();
    }
}
