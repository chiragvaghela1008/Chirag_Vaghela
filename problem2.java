import java.util.Scanner;

public class problem2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        for (int i = 1; i <= a * 2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
        scanner.close();

    }
}
