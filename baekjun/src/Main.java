import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 1. 문자열은 bufferedReader를 써서 입력을 받자
 * 2. 마지막에 대응되는 괄호가 나와야 되기 때문에 스택을 쓰자
 * 3. 한 줄마다 테스트 케이스가 적용되기 때문에 bufferedReader로 판별
 * 4. 온점(.)으로 끝나기 때문에 while문으로 반복문을 돌리자
 */

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String input = br.readLine();
            if (input.equals(".")) break;

            if (isBalanced(input)) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }

    private static boolean isBalanced(String input) {
        Deque<Character> stack = new ArrayDeque<>();

        char[] charArray = input.toCharArray();
        for (char c : charArray) {
            if (c == '(' || c == '[') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }

            } else if (c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

}