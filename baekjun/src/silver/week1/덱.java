package silver.week1;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class 덱 {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String command = sc.next();
            command(command, deque);
        }
    }

    private static void command(String command, Deque<Integer> deque) {
        if (command.startsWith("push")) {
            if (command.contains("front")) {
                deque.addFirst(sc.nextInt());
                return;
            }
            deque.addLast(sc.nextInt());
        } else if(command.startsWith("pop")) {
            if (deque.isEmpty()) {
                emptyOutput();
                return;
            }
            if (command.contains("front")) {
                System.out.println(deque.pollFirst());
                return;
            }
            System.out.println(deque.pollLast());
        } else if (command.equals("size")) {
            System.out.println(deque.size());
        } else if (command.equals("empty")) {
            System.out.println(deque.isEmpty() ? "1" : "0");
        } else if (command.equals("front")) {
            if (deque.isEmpty()) {
                emptyOutput();
                return;
            }
            System.out.println(deque.peekFirst());
        } else if(command.equals("back")) {
            if (deque.isEmpty()) {
                emptyOutput();
                return;
            }
            System.out.println(deque.peekLast());
        }
    }



    private static void emptyOutput(){
        System.out.println("-1");
    }
}
