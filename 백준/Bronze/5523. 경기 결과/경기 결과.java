import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int a, b;
        int ascore = 0;
        int bscore = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (a > b) {
                ascore += 1;
            }
            if (b > a) {
                bscore += 1;
            }
        }
        System.out.print(ascore + " ");
        System.out.print(bscore);
    }
}
