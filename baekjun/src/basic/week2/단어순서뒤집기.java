package basic.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 단어순서뒤집기 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            sb.append(String.format("Case #%d: ", i + 1)).append(reverseWord(input))
                    .append("\n");
        }
        System.out.println(sb);
    }

    private static String reverseWord(String input) {
        Deque<String> stack = new ArrayDeque<>();
        String[] split = input.split(" ");
        for (int i = 0; i < split.length; i++) {
            stack.push(split[i]);
        }

        StringBuilder sb = new StringBuilder();
        for (String s : stack) {
            sb.append(s).append(" ");
        }
        return sb.toString();
    }
}
