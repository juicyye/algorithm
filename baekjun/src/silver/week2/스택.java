package silver.week2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 스택 {
    private static Scanner sc = new Scanner(System.in);
    private static Deque<Integer> stack = new ArrayDeque<>();
    private static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) {
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            String command = sc.next();
            executeCommand(command);
        }
        System.out.println(sb);
    }

    private static void executeCommand(String command) {
        switch (command) {
            case "push":
                stack.push(sc.nextInt());
                break;
            case "pop":
                if (!stack.isEmpty()) {
                    sb.append(stack.pop()).append("\n");
                    break;
                }
                sb.append(-1).append("\n");
                break;
            case "size":
                sb.append(stack.size()).append("\n");
                break;
            case "empty":
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
                break;
            case "top":
                if (!stack.isEmpty()) {
                    sb.append(stack.peekFirst()).append("\n");
                    break;
                }
                sb.append(-1).append("\n");
                break;
        }

    }
}
