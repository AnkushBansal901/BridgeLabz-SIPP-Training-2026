import java.util.Scanner;

public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double base = sc.nextDouble();
        double height = sc.nextDouble();

        double areaInSqInches = 0.5 * base * height;
        double areaInSqCentimeters = areaInSqInches * 6.4516;

        System.out.println("Area in square inches is " + areaInSqInches);
        System.out.println("Area in square centimeters is " + areaInSqCentimeters);
    }
}