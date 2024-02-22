import java.util.Scanner;

public class CmdLineCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        char operator;

        System.out.println("Welcome to Command Line Calculator");
        System.out.println("Enter the first number:");
        num1 = scanner.nextDouble();

        System.out.println("Enter the second number:");
        num2 = scanner.nextDouble();

        System.out.println("Enter the operation (+, -, *, /):");
        operator = scanner.next().charAt(0);

        double result;
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Error: Invalid operation.");
        }
        scanner.close();
    }
}
