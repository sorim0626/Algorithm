import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        String [] f = new String[n];
        for (int i = 0; i < n; i++) {
            f[i] = sc.nextLine();
        }

        int l = f[0].length();
        char [] p = f[0].toCharArray();
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < l; j++) {
                if (p[j] != f[i].charAt(j)) {
                    p[j] = '?';
                }
            }
        }
        System.out.println(new String(p));
    }
}
