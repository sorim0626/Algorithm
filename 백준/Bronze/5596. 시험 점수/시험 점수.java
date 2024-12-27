
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] m1 = new int[4];
        int[] m2 = new int[4];
        int s = 0, t = 0;

        for (int i = 0; i < 4; i++) {
            m1[i] = sc.nextInt();
            s += m1[i];
        }

        for (int i = 0; i < 4; i++) {
            m2[i] = sc.nextInt();
            t += m2[i];
        }

        System.out.println(Math.max(s, t));
    }
}
