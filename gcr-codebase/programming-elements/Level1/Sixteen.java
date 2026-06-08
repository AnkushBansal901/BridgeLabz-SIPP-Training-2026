import java.util.Scanner;

public class Sixteen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfStudents = sc.nextInt();

        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("The maximum number of handshakes possible are " + handshakes);
    }
}