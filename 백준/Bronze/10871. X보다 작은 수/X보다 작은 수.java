import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, x;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        x = sc.nextInt();

        int [] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            if(a[i] < x)
            {
                System.out.print(a[i] + " ");
            }
        }
    }
}
