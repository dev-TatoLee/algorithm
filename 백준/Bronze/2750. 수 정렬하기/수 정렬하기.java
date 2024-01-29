import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int swap=1;
        int cnt =0;
        while (swap != 0){
            swap=0;
            for (int i = 0; i < n-1-cnt; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    swap++;
                }
            }
            cnt++;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
    }
}