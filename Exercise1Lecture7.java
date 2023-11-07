import java.util.Scanner;

public class Exercise1Lecture7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = divide(num1, num2);

            System.out.println("Result of division: " + result);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        } finally {
            scanner.close();
        }
    }

    public static double divide(double dividend, double divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }
}

