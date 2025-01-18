import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] odd = new int[7];
        int min = 100;
        int total = 0;
        boolean a = false;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            odd[i] = sc.nextInt();

            if (odd[i] % 2 != 0) {
                total += odd[i];
                if (odd[i] < min) {
                    min = odd[i];
                }
                a = true;
            }
        }

        if (a) {
            System.out.println(total);
            System.out.println(min);
        }
        else {
            System.out.println(-1);
        }
    }
}
