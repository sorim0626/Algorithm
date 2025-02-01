import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int r = a * b * c;

        String rS = Integer.toString(r);

        int[] co = new int[10];

        for (char ch : rS.toCharArray()) {
            co[ch - '0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(co[i]);
        }
    }
}
