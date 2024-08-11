import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, m;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();


        int [][] a = new int[100][100];
        int [][] b = new int[100][100];

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
