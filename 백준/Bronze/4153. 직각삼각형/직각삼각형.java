import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int a,b,c;
        StringTokenizer st = new StringTokenizer(bf.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        while (a != 0 || b != 0 || c != 0) {
            //가장 긴 변을 c로 두기
            if (a > b && a > c) {
                int temp=a;
                a=c;
                c = temp;
            }
            if (b > a && b > c) {
                int temp=b;
                b=c;
                c = temp;
            }

            if (c * c == a * a + b * b) {
                sb.append("right\n");
            } else {
                sb.append("wrong\n");
            }

            st = new StringTokenizer(bf.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            c = Integer.parseInt(st.nextToken());
        }

        System.out.println(sb);


    }
}