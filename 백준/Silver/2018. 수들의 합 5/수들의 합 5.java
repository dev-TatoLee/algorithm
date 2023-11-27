import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int sp = 1;
        int ep = 1;
        int sum = 1;
        int count = 0;

        // 1+2+3+4+5, sp=1, ep=5; 2+3+4+5

        for (ep = 1; ep <= n; ) {
            if (sum < n) {
                ep++;
                sum += ep;
            } else if (sum > n) {
                sum -= sp;
                sp++;
            } else {
                count++;
                ep++;
                sum += ep;
            }
        }

        System.out.println(count);
    }
}