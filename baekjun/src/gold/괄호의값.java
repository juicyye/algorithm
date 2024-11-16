package gold;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 괄호의값 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int result = solution(input);
        System.out.println(result);

    }

    private static int solution(String input) {
        Deque<Character> stack = new ArrayDeque<>();
        int result = 0;
        int temp = 1;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '(') {
                stack.push(c);
                temp *= 2;
            } else if (c == '[') {
                stack.push(c);
                temp *= 3;
            } else if (c == ')') {
                if (stack.isEmpty() || stack.peek() != '(') {
                    return 0;
                }
                if (input.charAt(i - 1) == '(') {
                    result += temp;
                }
                stack.pop();
                temp /= 2;
            } else if (c == ']') {
                if (stack.isEmpty() || stack.peek() != '[') {
                    return 0;
                }
                if (input.charAt(i - 1) == '[') {
                    result += temp;
                }
                stack.pop();
                temp /= 3;
            }
        }

        if (!stack.isEmpty()) {
            return 0;
        }
        return result;
    }


}
