import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int tk = (a + c - 1) / c;
        int fm = (b + d - 1) / d;

        int t = Math.max(tk, fm);
        int o = l - t;

        System.out.println(o);
    }
}