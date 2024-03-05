import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str= br.readLine();
            int length = str.length();
            sb.append(str.charAt(0));
            sb.append(str.charAt(length-1));
            sb.append("\n");
        }
        System.out.println(sb);
    }
}