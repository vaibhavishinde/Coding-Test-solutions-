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
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a * b;
            case "divide":
                if (b != 0) return a / b;
                else {
                    System.out.println("Cannot divide by zero.");
                    return Double.NaN;
                }
            default:
                System.out.println("Invalid operation.");
                return Double.NaN;
        }
    }

    public static void main(String[] args) {
        Program1 calc = new Program1(10, 5, "divide");
        System.out.println("Result: " + calc.calculate());
    }
}
