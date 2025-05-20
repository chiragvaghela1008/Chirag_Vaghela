import java.util.Scanner;

public class problem3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            a = a - 1;
        }

        StringBuilder rs = new StringBuilder();
        int count = 1;

        for (int i = 0; i < a; i++) {
            if (i > 0) {
                rs.append(",");
            }
            rs.append(count);
            count += 2;
        }

        System.out.println(rs.toString());
        scanner.close();

    }

}
