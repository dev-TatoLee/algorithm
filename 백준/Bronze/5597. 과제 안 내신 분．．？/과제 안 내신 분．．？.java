import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //1~30의 출석번호 중 28개 입력 없는 학생 2명을 오름차순 출력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[30];
        int[] arr1 = new int[2];
        int cnt=0;
        for (int i = 0; i < 30; i++) {
            arr[i] = 0;
        }
        for (int i = 0; i < 28; i++) {
            int n = Integer.parseInt(br.readLine());
            arr[n-1]=1;
        }
        for (int i = 0; i < 30; i++) {
            if (arr[i] == 0) {
                arr1[cnt] = i+1;
                cnt++;
            }
        }
        if (arr1[0] > arr1[1]) {
            sb.append(arr1[1]);
            sb.append("\n");
            sb.append(arr1[0]);
        }else {
            sb.append(arr1[0]);
            sb.append("\n");
            sb.append(arr1[1]);
        }

        System.out.println(sb);
    }
}