import java.util.Scanner;

public class Main {
    public static void main(String[] args) {        
        int month, day;
        
        Scanner sc = new Scanner(System.in);
        month = sc.nextInt();
        day = sc.nextInt();
        
        if (month == 2 && day == 18) 
        {
            System.out.println("Special");
        } 
        else if (month > 2 || (month == 2 && day > 18)) 
        {
            System.out.println("After");
        } 
        else 
        {
            System.out.println("Before");
        }
        
    }
}

