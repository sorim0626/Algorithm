import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int o, i;
        int [] total = new int[4];
        int n = 0;
        int max = 0;

        Scanner sc = new Scanner(System.in);
        for(int j = 0; j < 4; j++)
        {
            o = sc.nextInt();
            i = sc.nextInt();

            n = n - o + i;
            total[j] = n;
        }
        for(int j = 0; j < 4; j++)
        {
            if(total[j] > max)
            {
                max = total[j];
            }
        }
        System.out.println(max);
    }
}
