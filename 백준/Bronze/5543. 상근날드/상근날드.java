import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        int b3 = sc.nextInt();

        int d1 = sc.nextInt();
        int d2 = sc.nextInt();

        int hm = Math.min(b1, Math.min(b2, b3));
        int dm = Math.min(d1, d2);

        System.out.println(hm + dm - 50);
    }
}
