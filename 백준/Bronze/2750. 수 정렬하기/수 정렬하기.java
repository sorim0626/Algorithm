import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     
        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int [] s = new int [n];

        for(int i = 0; i < n; i++)
        {
            s[i] = sc.nextInt();
        }

        Arrays.sort(s);

        for(int i = 0; i < n; i++)
        {
            System.out.println(s[i]);
        }

        }
    }

