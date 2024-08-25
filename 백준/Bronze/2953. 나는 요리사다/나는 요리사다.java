import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int [][] score = new int[5][4];
        int [] total = new int[5];
        int max = 0;
        int idx = 0;
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                score[i][j] = sc.nextInt();
            }
        }
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 4; j++)
            {
                total[i] += score[i][j];
            }
        }
        for(int i = 0; i < 5; i++)
        {
         if(total[i] > max)
         {
             max = total[i];
             idx = i;
         }
        }
        System.out.print(idx + 1 + " ");
        System.out.print(max);
    }
}
