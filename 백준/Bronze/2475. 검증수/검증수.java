import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sum = 0; 
        int n;
        int answer;
        
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < 5; i++)
        {
            n = sc.nextInt();
            sum += n * n;
        }
        
        answer = sum % 10;
        System.out.println(answer);
    }
}
