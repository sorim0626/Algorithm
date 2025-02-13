import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int e = sc.nextInt();
        int c = sc.nextInt();

        int [] p = new int[c];
        for(int i = 0; i < c; i++) {
            p[i] = sc.nextInt();
        }

        Arrays.sort(p);

        int max = 0;
        int p2 = 0;
        for (int i = 0; i < c; i++) {
            int price = p[i];
            int b = c - i;
            int s = Math.min(b, e);
            int m = price * s;

            if (m > max) {
                max = m;
                p2 = price;
            }
        }
        System.out.println(p2 + " " + max);
    }
}
