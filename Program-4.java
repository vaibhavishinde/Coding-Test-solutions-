public class Program4 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};

        System.out.print("{");
        for (int i = 1; i <= 9; i++) {
            int count = 0;
            for (int num : numbers) {
                if (num % i == 0) {
                    count++;
                }
            }
            System.out.print(i + ": " + count);
            if (i < 9) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
