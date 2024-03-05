import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n=str.length();
        char[] charArr=new char[n];
        //A + 32 = a
        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 'a') {
                sb.append((char)(c - 32));
            } else {
                sb.append((char)(c + 32));
            }
        }
        System.out.println(sb);
    }
}