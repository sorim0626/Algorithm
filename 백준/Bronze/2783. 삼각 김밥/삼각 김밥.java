import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();
        int n = sc.nextInt();

        double minPrice = (x / y) * 1000;

        for (int i = 0; i < n; i++) {
            double xi = sc.nextDouble();
            double yi = sc.nextDouble();
            minPrice = Math.min(minPrice, (xi / yi) * 1000);
        }

        System.out.printf("%.2f\n", minPrice);
        sc.close();
    }
}
