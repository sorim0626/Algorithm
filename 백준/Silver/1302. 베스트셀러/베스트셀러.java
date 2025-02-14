import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int b = sc.nextInt();
        sc.nextLine();

        HashMap<String, Integer> bc = new HashMap<>();

        for (int i = 0; i < b; i++) {
            String n = sc.nextLine();
            bc.put(n, bc.getOrDefault(n, 0) + 1);
        }

        String best = "";
        int max = 0;

        for (String n : bc.keySet()) {
            int c = bc.get(n);
            if (c > max || (c == max && n.compareTo(best) < 0)) {
                max = c;
                best = n;
            }
        }
        System.out.println(best);
    }
}
