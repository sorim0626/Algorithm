import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        long a, b;
        
        Scanner sc = new Scanner(System.in);
        a = sc.nextLong();
        b = sc.nextLong();

        long r = Math.abs(a - b);
        System.out.println(r);
    }
}
