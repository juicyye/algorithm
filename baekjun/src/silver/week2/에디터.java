package silver.week2;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 에디터 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int commandCount = sc.nextInt();

        Deque<Character> left = new ArrayDeque<>();
        Deque<Character> right = new ArrayDeque<>();

        for (char c : n.toCharArray()) {
            left.push(c);
        }

        for (int i = 0; i < commandCount; i++) {
            String command = sc.next();

            switch (command) {
                case "L":
                    if (!left.isEmpty()) {
                        right.push(left.pop());
                    }
                    break;
                case "D":
                    if (!right.isEmpty()) {
                        left.push(right.pop());
                    }
                    break;
                case "B":
                    if (!left.isEmpty()) {
                        left.pop();
                    }
                    break;
                case "P":
                    String input = sc.next();
                    left.push(input.charAt(0));
                    break;
            }
        }

        StringBuilder sb = new StringBuilder();

        while(!left.isEmpty()) {
            right.push(left.pop());
        }

        while(!right.isEmpty()) {
            sb.append(right.pop());
        }

        System.out.println(sb);

    }
}
