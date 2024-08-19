import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int h, m;

        Scanner sc = new Scanner(System.in);
        h = sc.nextInt();
        m = sc.nextInt();

        if(h == 0 && m < 45)
        {
            System.out.printf("23 %d", m + 60 - 45);
        }
        else if(m < 45)
        {
            System.out.print(h - 1 + " ");
            System.out.print( m + 60 - 45);
        }
        else
        {
            System.out.print(h + " ");
            System.out.print(m - 45);
        }
    }
}
