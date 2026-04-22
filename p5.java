import java.util.Scanner;

public class Problem5 {

    // Recursive method
    public static int sumRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumRecursive(n - 1);
    }

    // Formula method
    public static int sumFormula(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0)");
        } else {

            int recursiveResult = sumRecursive(n);
            int formulaResult = sumFormula(n);

            System.out.println("Sum using recursion = " + recursiveResult);
            System.out.println("Sum using formula = " + formulaResult);

            if (recursiveResult == formulaResult) {
                System.out.println("Both results are equal ✔");
            } else {
                System.out.println("Results are NOT equal ❌");
            }
        }

        input.close();
    }
}
