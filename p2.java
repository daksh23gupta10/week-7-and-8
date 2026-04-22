import java.util.Scanner;

public class Problem2 {

    // Method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int numberOfStudents = input.nextInt();

        int result = calculateHandshakes(numberOfStudents);

        System.out.println("The maximum number of handshakes is " + result);

        input.close();
    }
}
