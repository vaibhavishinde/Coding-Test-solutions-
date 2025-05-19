import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int limit = a % 2 == 0 ? a - 1 : a;
        int count = (limit + 1) / 2;

        for (int i = 0; i < count; i++) {
            System.out.print((2 * i + 1) + (i < count - 1 ? ", " : ""));
        }
        sc.close();
    }
}
