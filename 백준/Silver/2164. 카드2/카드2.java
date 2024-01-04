import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= num; i++) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            //한장 버리기
            queue.poll();
            //한장 빼서 다시넣기
            Integer card = queue.poll();
            queue.add(card);
        }
        System.out.println(queue.poll());
    }
}