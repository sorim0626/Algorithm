import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int idx = 0;
        int [] a = new int[9];
        int max = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 9; i++)
        {
            a[i] = sc.nextInt();

            if(a[i] > max)
            {
                max = a[i];
                idx = i;
            }
        }

        System.out.println(max);
        System.out.println(idx + 1);
    }
}
