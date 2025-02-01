import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int c = sc.nextInt();
        
        int t = a * 60 + b + c;
        
        int h = (t / 60) % 24;
        int m = t % 60;
        
        System.out.println(h + " " + m);
    }
}
