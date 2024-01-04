import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        int num = 1;
        boolean No = true;

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (arr[i] >= num) {
                while (arr[i]>=num){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else {
                Integer pop = stack.pop();
                if (pop != arr[i]) {
                    System.out.println("NO");
                    No = false;
                    break;
                }
                sb.append("-\n");
            }
        }
        if (No) {
            System.out.println(sb);
        }

    }
}