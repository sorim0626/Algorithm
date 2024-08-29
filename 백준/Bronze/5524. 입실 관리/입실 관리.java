import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        String [] lower = new String[n];
        for(int i = 0; i < n; i++)
        {
            lower[i] = sc.next().toLowerCase();
        }
        for(String lr : lower) {
            System.out.println(lr);
        }
    }
}
