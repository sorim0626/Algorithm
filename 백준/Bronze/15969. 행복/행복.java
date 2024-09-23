import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] score = new int[n];

        for(int i = 0; i < n; i++)
        {
            score[i] = sc.nextInt();
        }

        for(int i = 0; i < score.length; i++)
        {
            if(score[i] > max)
            {
                max = score[i];
            }
            if (score[i] < min)
            {
                min = score[i];
            }
        }
        System.out.println(max - min);
    }
}
