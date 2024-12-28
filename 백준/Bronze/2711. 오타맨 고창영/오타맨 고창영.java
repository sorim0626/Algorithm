
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();

            StringBuilder sb = new StringBuilder(s);

            sb.deleteCharAt(n - 1);
            System.out.println(sb.toString());
        }
    }
}
