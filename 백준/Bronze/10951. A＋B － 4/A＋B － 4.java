import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a, b;

        Scanner sc = new Scanner(System.in);
        while(sc.hasNext())  // hasNext() 뒤로 Boolean, Double, Int 등 자료형이 붙은 건 입력 값이
        {                   // 그 자료형일 경우 true 값을 반환, 아닐 경우 false 를 반환한다.
            a = sc.nextInt();
            b = sc.nextInt();

            System.out.println(a + b);
        }
        sc.close();
    }
}
