
import java.util.Scanner;

public class Distance_in_Yards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double distanceInFeet = sc.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is "
                + yards + " while the distance in miles is " + miles);
    }
}