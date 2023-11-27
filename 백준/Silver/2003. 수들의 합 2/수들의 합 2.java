import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int sp = 0;
        int ep;
        int sum = arr[0];
        int count = 0;

        for (ep = 0; ep < n;) {
            if (sum < m) {
                ep++;
                if(ep==n){
                    break;
                }
                sum += arr[ep];
            } else if (sum > m) {
                sum -= arr[sp];
                sp++;
            } else {
                count++;
                ep++;
                if (ep == n) {
                    break;
                }
                sum += arr[ep];
            }
        }
        sb.append(count).append("\n");
        System.out.println(sb);
    }
}