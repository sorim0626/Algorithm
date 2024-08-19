import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int book, box;
        int min = 0;

        Scanner sc = new Scanner(System.in);
        book = sc.nextInt();
        box = sc.nextInt();

        if(book == 0)
        {
            System.out.println(0);
            return;
        }

        int [] weight = new int[book + 1];
        for (int i = 0; i < book; i++) {
            weight[i] = sc.nextInt();
        }
        int count = 1;
        int boxweight= 0;
        for(int i = 0; i <= book; i++)
        {
            if(boxweight + weight[i] <= box)
            {
                boxweight += weight[i];
            }
            else {
                count++;
                boxweight = weight[i];
            }
        }
        System.out.println(count);

    }
}
