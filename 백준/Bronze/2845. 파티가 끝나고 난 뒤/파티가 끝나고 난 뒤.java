
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();
        int p = sc.nextInt();

        int n = l * p;
        for(int i = 1; i <= 5; i++) {
            int a = sc.nextInt();
            System.out.print((a - n) + " ");
        }
    }
}
