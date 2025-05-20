
import java.util.InputMismatchException;
import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double a, b;
        try {
            System.out.println("Enter the values: ");

            a = scanner.nextDouble();
            b = scanner.nextDouble();

            System.out.println("enter operator(+,-,*,/):");

            char opeartion = scanner.next().charAt(0);
            double d = 0;

            switch (opeartion) {
                case '+':
                    d = a + b;
                    break;

                case '-':
                    d = a - b;
                    break;

                case '*':
                    d = a * b;
                    break;

                case '/':
                    d = a / b;
                    break;

                default:
                    System.out.println("you enter wrong input");
            }

            System.out.println("final result : ");
            System.out.println();

            System.out.println(a + " " + opeartion + " " + b + " = " + d);
        } catch (InputMismatchException i) {
            System.out.println("enter valid input");
        } finally {
            scanner.close();
        }

    }

}