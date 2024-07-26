import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       int n, v, c = 0;

       Scanner sc = new Scanner(System.in);
       n = sc.nextInt();

       int [] a = new int[n];

       for(int i = 0; i < n; i++)
       {
            a[i] = sc.nextInt();
       }
       v = sc.nextInt();

       for(int i = 0; i < n; i++)
       {
           if(a[i] == v)
           {
               c += 1;
           }
       }
        System.out.println(c);
    }
}
