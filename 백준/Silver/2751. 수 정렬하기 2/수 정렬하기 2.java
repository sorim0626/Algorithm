import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());

        int [] a = new int[n];

        for(int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(a);
        for(int i = 0; i < n; i++)
        {
            bw.write(a[i] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
