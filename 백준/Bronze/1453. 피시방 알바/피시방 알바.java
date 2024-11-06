import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] seat = new int[101];
        int r = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int w = sc.nextInt();

            if(seat[w] == 1) {
                r += 1;
            }
            else {
                seat[w] += 1;
            }
        }
        System.out.println(r);
    }
}
