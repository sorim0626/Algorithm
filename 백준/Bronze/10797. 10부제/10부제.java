import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int [] car = new int[5];
        int count = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i = 0; i < 5; i++) {
            car[i] = sc.nextInt();
        }

        for(int i = 0; i < 5; i++) {
            if(car[i] == num) {
                count += 1;
            }
        }

        System.out.println(count);
    }
}
