import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.nextLine();

        char [][] s = new char[n][m];

        for (int i = 0; i < n; i++) {
            String l = sc.nextLine();
            s[i] = l.toCharArray();
        }

        boolean [] r = new boolean[n];
        boolean [] c = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (s[i][j] == 'X') {
                    r[i] = true;
                    c[j] = true;
                }
            }
        }

        int rc = 0;
        for (int i = 0; i < n; i++) {
            if (!r[i])
                rc++;
        }

        int cc = 0;
        for (int i = 0; i < m; i++) {
            if (!c[i])
                cc++;
        }

        System.out.println(Math.max(rc, cc));
    }
}
