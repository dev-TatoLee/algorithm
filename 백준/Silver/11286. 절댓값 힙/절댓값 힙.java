import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(((o1, o2) -> {
            //양수 리턴하면 o2 우선순위 높음 음수 -> o1
            //절대값 작은수, 같은 경우 음수 우선
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if (abs1 == abs2) {
                return o1 > o2 ? 1 : -1; //o1이 작으면 (음수면) 양수, o2가 작으면 음수 리턴
            }

            return abs1 - abs2; //abs1이 크면 양수 리턴
        })); //우선순위 큐 우선순위 선언
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(bf.readLine());
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            if (num != 0) {
                priorityQueue.add(num);
            } else {
                if (priorityQueue.isEmpty()) {
                    System.out.println(0);
                }
                else {
                    System.out.println(priorityQueue.poll());
                }
            }
        }

    }
}