package silver.week2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 큐 {
    private static Scanner sc = new Scanner(System.in);
    private static Deque<Integer> arr = new ArrayDeque<>();
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
                int k = sc.nextInt();
                arr.offer(k);
                break;
            case "pop":
                if (!arr.isEmpty()) {
                    Integer current = arr.pop();
                    sb.append(current).append("\n");
                    break;
                }
                sb.append(-1).append("\n");
                break;
            case "size":
                sb.append(arr.size()).append("\n");
                break;
            case "empty":
                sb.append(arr.isEmpty() ? 1 : 0).append("\n");
                break;
            case "front":
                if (!arr.isEmpty()) {
                    sb.append(arr.peekFirst()).append("\n");
                    break;
                }
                sb.append(-1).append("\n");
                break;
            case "back":
                if (!arr.isEmpty()) {
                        sb.append(arr.peekLast()).append("\n");
                        break;
                }
                sb.append(-1).append("\n");
                break;
        }

    }
}
