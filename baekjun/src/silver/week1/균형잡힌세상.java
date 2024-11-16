package silver.week1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class 균형잡힌세상 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input;

        StringBuilder sb = new StringBuilder();

        while (!(input = br.readLine()).equals(".")) {
            Deque<Character> stack = new ArrayDeque<>();

            char[] charArray = input.replaceAll("[^\\(\\)\\[\\]]", "").toCharArray();

            String answer = "yes";
            for (char c : charArray) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    if (stack.isEmpty() || stack.peek() != '(') {
                        answer = "no";
                        break;
                    }
                    stack.pop();
                } else if (c == ']') {
                    if(stack.isEmpty() || stack.peek() != '[') {
                        answer = "no";
                        break;
                    }
                    stack.pop();
                }
            }
            if(!stack.isEmpty()) answer = "no";
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
        br.close();
    }
}
