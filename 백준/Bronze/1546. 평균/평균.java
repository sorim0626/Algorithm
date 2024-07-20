import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        double max = 0;
        double avg, sum = 0;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        double[] s = new double[n];

        for(int i = 0; i < n; i++)
        {
            s[i] = sc.nextInt();

            if(s[i] > max)
            {
                max = s[i];
            }
        }
        for(int i = 0; i < n; i++)
        {
            s[i] = (s[i] / max) * 100;
            sum += s[i];
        }
        avg = sum / n;
        System.out.println(avg);
    }
}
