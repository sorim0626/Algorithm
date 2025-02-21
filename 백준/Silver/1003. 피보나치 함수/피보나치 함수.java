import java.util.Scanner;

public class Main {
    static int [] z = new int[41];
    static int [] o = new int[41];

    public static void fibonacci(int n) {
        z[0] = 1;
        o[0] = 0;
        z[1] = 0;
        o[1] = 1;

        // Bottom-up 방식
        for (int i = 2; i <= n; i++) {
            z[i] = z[i - 1] + z[i - 2];
            o[i] = o[i - 1] + o[i - 2];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

       for (int i = 0; i < t; i++) {
           int n = sc.nextInt();
           fibonacci(n);
           System.out.println(z[n] + " " + o[n]);
       }
    }
}
