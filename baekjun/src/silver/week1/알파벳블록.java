package silver.week1;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.Scanner;

public class 알파벳블록 {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int n = sc.nextInt();
        Deque<Input> block = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int command = sc.nextInt();
            command(i, command, block);
        }

        StringBuilder sb = new StringBuilder();
        for (Input input : block) {
            sb.append(input.str);
        }

        System.out.println(block.isEmpty() ? "0" : sb);
    }


    private static void command(int index, int command, Deque<Input> block) {
        switch (command) {
            case 1:
                String s1 = sc.next();
                block.addLast(new Input(index, s1));
                break;
            case 2:
                String s2 = sc.next();
                block.addFirst(new Input(index, s2));
                break;
            case 3:
                if (!block.isEmpty()) {
                    Input max = Collections.max(block);
                    block.remove(max);
                }

        }
    }

    private static class Input implements Comparable<Input> {
        int index;
        String str;

        public Input(int index, String str) {
            this.index = index;
            this.str = str;
        }

        @Override
        public int compareTo(Input o) {
            return index - o.index;
        }
    }
}
