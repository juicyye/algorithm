package step2.chap16;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Deque;

public class 스택2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int i = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int j = 0; j < i; j++) {
            String[] input = br.readLine().split(" ");
            int command = Integer.parseInt(input[0]);
            executeCommand(stack, command, input, sb);
        }

        // 한 번에 출력하기
        System.out.print(sb);
    }

    public static void executeCommand(Deque<Integer> stack, int command, String[] input, StringBuilder sb) {
        switch (command) {
            case 1 -> {
                int value = Integer.parseInt(input[1]);
                stack.push(value);
            }
            case 2 -> {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            }
            case 3 -> {
                sb.append(stack.size()).append("\n");
            }
            case 4 -> {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            }
            case 5 -> {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
    }
}
