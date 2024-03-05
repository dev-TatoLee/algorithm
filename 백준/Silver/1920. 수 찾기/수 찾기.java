import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Long[] arr = new Long[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }
        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            Long r = Long.parseLong(st.nextToken());
            int start =0;
            int end = n-1;
            int check=0;
            while (start<=end) {
                int center=(start+end) / 2;
                if (Objects.equals(arr[center], r)) {
                    check=1;
                    break;
                } else if (r<arr[center]) {
                    end = center-1;
                }else {
                    start=center+1;
                }
            }
            sb.append(check);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}