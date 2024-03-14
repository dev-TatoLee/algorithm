import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N: 카드 갯수 M: 목표 수
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] cards = new int[N+1];
        //M과 가장 가까운 값 저장
        int sum = 0;
        //선택 되어 있는 카드
        int num1, num2, num3;

        st = new StringTokenizer(br.readLine());
        //카드에 적힌 수 입력 받기, 인덱스 1부터 저장
        for (int i = 1; i <= N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        //카드 탐색
        int tSum=0;
        for (int i = 1; i <= N - 2; i++) {
            num1 = cards[i];
            tSum = num1;
            if (tSum >= M){
                continue;
            }
            for (int j = i + 1; j <= N - 1; j++) {
                num2 = cards[j];
                tSum = num1 + num2;
                if (tSum >= M){
                    continue;
                }
                for (int k = j + 1; k <= N; k++) {
                    num3 = cards[k];
                    tSum = num1 + num2 + num3;
                    if (tSum > M){
                        continue;
                    }
                    //sum보다 tSum이 M과 가까운지 체크
                    if (M - tSum < M - sum) {
                        sum = tSum;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}