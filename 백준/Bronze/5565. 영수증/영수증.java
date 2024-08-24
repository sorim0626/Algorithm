import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int total;
        int book;

        Scanner sc = new Scanner(System.in);
        total = sc.nextInt();

        for(int i = 0; i < 9; i++)
        {
            book = sc.nextInt();
            total -= book;
        }
        System.out.println(total);
    }
}
