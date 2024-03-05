import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            String str = br.readLine();
            if (str == null || str.isEmpty()) {
                break;
            }
            sb.append(str);
            sb.append("\n");
        }
        System.out.println(sb);
    }
}