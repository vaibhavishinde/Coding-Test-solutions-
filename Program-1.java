import java.util.Scanner;

public class SimpleCalc {
    double num1, num2;
    String op;

    public SimpleCalc(double num1, double num2, String op) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
    }

    public double calculate() {
        if (op.equals("+")) {
            return num1 + num2;
        } else if (op.equals("-")) {
            return num1 - num2;
        } else if (op.equals("*")) {
            return num1 * num2;
        } else if (op.equals("/")) {
            if (num2 == 0) {
                System.out.println("Can't divide by zero!");
                return 0;
            }
            return num1 / num2;
        } else {
            System.out.println("Unknown operation.");
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("First number: ");
        double a = sc.nextDouble();

        System.out.print("Second number: ");
        double b = sc.nextDouble();

        sc.nextLine();  

        System.out.print("Operation (+, -, *, /): ");
        String op = sc.nextLine();

        SimpleCalc calc = new SimpleCalc(a, b, op);
        System.out.println("Result: " + calc.calculate());

        sc.close();
    }
}
