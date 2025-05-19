import java.util.Scanner;

public class Program1 {
    double a, b;
    String operation;

    public Program1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase();
    }

    public double calculate() {
        switch (operation) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                if (b != 0) return a / b;
                else {
                    System.out.println("Cannot divide by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation. Use add, subtract, multiply, or divide.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        scanner.nextLine();
        System.out.print("Enter operation (+, -, *, /): ");
        String operation = scanner.nextLine();

        Program1 calc = new Program1(a, b, operation);
        double result = calc.calculate();

        System.out.println("Result: " + result);

        scanner.close();
    }
}
