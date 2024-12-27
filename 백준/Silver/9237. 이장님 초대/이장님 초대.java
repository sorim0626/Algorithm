import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }

        Arrays.sort(t);
        for (int i = 0; i < n / 2; i++) {
            int temp = t[i];
            t[i] = t[n - i - 1];
            t[n - i - 1] = temp;
        }

        int m = 0;
        for (int i = 0; i < n; i++) {
            m = Math.max(m, i + 1 + t[i]);
        }

        System.out.println(m + 1);
    }
}
