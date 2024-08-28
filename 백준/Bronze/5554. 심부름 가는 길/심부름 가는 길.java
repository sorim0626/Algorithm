import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int htos, stop, ptoa, atoh;
        int sum = 0;
        int m = 0, s = 0;

        Scanner sc = new Scanner(System.in);
        htos = sc.nextInt();
        stop = sc.nextInt();
        ptoa = sc.nextInt();
        atoh = sc.nextInt();

        sum = htos + stop + ptoa + atoh;

        m = sum / 60;
        s = sum % 60;

        System.out.println(m);
        System.out.println(s);

    }
}
