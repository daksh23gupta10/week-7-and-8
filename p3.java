import java.util.Scanner;

public class Problem3 {

    // Method to calculate number of rounds
    public static double calculateRounds(double a, double b, double c) {

        double perimeter = a + b + c;   // in meters
        double totalDistance = 5000;    // 5 km = 5000 meters

        return totalDistance / perimeter;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter side 1 (meters): ");
        double a = input.nextDouble();

        System.out.print("Enter side 2 (meters): ");
        double b = input.nextDouble();

        System.out.print("Enter side 3 (meters): ");
        double c = input.nextDouble();

        double rounds = calculateRounds(a, b, c);

        System.out.println("The athlete needs to complete " + rounds + " rounds");

        input.close();
    }
}
