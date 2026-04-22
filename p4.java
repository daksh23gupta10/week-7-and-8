import java.util.Scanner;

public class Problem4 {

    // Method to find factors
    public static int[] getFactors(int n) {

        int count = 0;

        // Count factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;

        // Store factors
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Sum of factors
    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return sum;
    }

    // Product of factors
    public static int product(int[] arr) {
        int prod = 1;
        for (int x : arr) {
            prod *= x;
        }
        return prod;
    }

    // Sum of squares
    public static double sumOfSquares(int[] arr) {
        double sum = 0;
        for (int x : arr) {
            sum += Math.pow(x, 2);
        }
        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int[] factors = getFactors(number);

        System.out.println("\nFactors:");
        for (int x : factors) {
            System.out.print(x + " ");
        }

        System.out.println("\n\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));

        input.close();
    }
}
