import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt=0;
        int check=0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 1) {
                continue;
            }
            check=0;
            for (int j = 2; j < (num / 2)+1; j++) {
                if (num % j == 0) {
                    //나누어 떨어짐-> 소수가 아니다
                    check=1;
                    break;
                }
            }
            if (check == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}