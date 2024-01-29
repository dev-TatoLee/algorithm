import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String str = bf.readLine();
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < str.length(); i++) {
            int max = i;
            for (int j = i+1; j < str.length(); j++) {
                if (arr[max] < arr[j]){
                    max = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp;
        }
        for (int i = 0; i < str.length(); i++) {
            System.out.print(arr[i]);
        }
        System.out.println(" ");
    }
}