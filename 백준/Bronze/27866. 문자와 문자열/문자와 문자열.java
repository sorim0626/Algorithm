import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String a;
        int i;

        Scanner sc = new Scanner(System.in);
        a = sc.next();
        i = sc.nextInt();

        System.out.println(a.charAt(i - 1));
    }
}
