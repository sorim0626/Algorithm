import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String d = sc.nextLine();
        String w = sc.nextLine();
        
        int c = 0;  
        int i = 0;
        
        while ((i = d.indexOf(w, i)) != -1) {
            c++;
            i += w.length();
        }
        System.out.println(c);
    }
}
