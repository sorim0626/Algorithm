import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int score;
        int sum = 0;
        int avg = 0;

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            score = sc.nextInt();
            if(score < 40)
            {
                score = 40;
            }
            sum += score;
        }
        avg = sum / 5;
        System.out.println(avg);
    }
}
