import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
            
            if (a[i] > max) 
            {
                max = a[i];
            }
            if (a[i] < min) 
            {
                min = a[i];
            }
        }

        System.out.printf("%d %d", min, max);
    }
}

