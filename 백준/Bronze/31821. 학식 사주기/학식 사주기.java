import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        int sum = 0;

        int [] money = new int[menu];
        for(int i = 0; i < menu; i++)
        {
            money[i] = sc.nextInt();
        }

        int student = sc.nextInt();

        for(int i = 0; i < student; i++)
        {
            int select = sc.nextInt();
            sum += money[select - 1];
        }
        System.out.println(sum);
    }
}
