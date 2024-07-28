import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [] n = new int[31];
        int a;

        Scanner sc = new Scanner(System.in);
        for(int i = 1; i <=28; i++)
        {
            a = sc.nextInt();
            n[a]++;
        }
        for(int i = 1; i <= 30; i++)
        {
            if(n[i] < 1)
            {
                System.out.println(i);
            }
        }
    }
}
