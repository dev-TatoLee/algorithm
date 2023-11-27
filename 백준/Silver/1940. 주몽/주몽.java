import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        long[] arr = new long[n];
        int sp =0;
        int ep;
        int count = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);
        long sum = 0;

        for (ep=n-1; sp!=ep; ) {
            sum = arr[sp] + arr[ep];
            if (sum < m) {
                sp++;
            } else if (sum > m) {
                ep--;
            } else {
                count++;
                sp++;
            }
        }
        sb.append(count).append("\n");
        System.out.println(sb);
    }
}