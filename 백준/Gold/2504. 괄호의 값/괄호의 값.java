import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;



public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String st = bufferedReader.readLine();

        Stack<Character> stack = new Stack<>();
        int result=0;
        int num =1;
        boolean check=true;

        for (int i = 0; i < st.length(); i++) {
            char c = st.charAt(i);
            if (c == '(' || c == '[') {
                stack.push(c);
                if (c == '(') {
                    num *= 2;
                } else {
                    num *= 3;
                }
            } else if (c == ')' || c == ']') {
                //앞쪽 괄호가 없는 경우
                if (stack.isEmpty()) {
                    check = false;
                    break;
                }
                Character pop = stack.pop();
                //앞쪽에 짝이 안맞는 괄호가 있는 경우
                if ((pop == '(' && c == ']') || (pop == '[' && c == ')')) {
                    check = false;
                    break;
                }
                //가장 안쪽 괄호인지 확인
                char pre = st.charAt(i - 1); //직전 괄호
                if ((pre == '(' && c == ')') || (pre == '[' && c == ']')) {
                    result += num;
                }
                if (c == ')') {
                    num /= 2;
                } else {
                    num /= 3;
                }
            } else {
                check = false;
            }
        }
        if (check&&!stack.isEmpty()) {
            check = false;

        }
        if (check) {
            System.out.println(result);
        } else {
            System.out.println(0);
        }
    }
}