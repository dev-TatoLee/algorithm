import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result=1;
        //0,1 팩토리얼은 1
        if (n == 0 || n == 1) {
            System.out.println(result);
            return;
        }
        //n=5 5,4,3,2,1까지 곱해야함 (1은 곱해도 동일)i>1
        for (int i = n; i > 1; i--) {
            result *= i;
        }
        System.out.println(result);
    }
}