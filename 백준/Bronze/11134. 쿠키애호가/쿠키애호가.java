import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        int T = scanner.nextInt();
        
        for (int i = 0; i < T; i++) {
            
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            
            int day = (n + c - 1) / c; 
            
            System.out.println(day);
        }
    }
}
