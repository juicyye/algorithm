package cote._24_7;

import java.util.ArrayDeque;
import java.util.Deque;

public class 피보나치수 {
    public static int solution(int n) {
        Deque<Integer> queue = new ArrayDeque<>();
        queue.offer(0);
        queue.offer(1);
        for (int i = 1; i < n; i++) {
            Integer c1 = queue.poll();
            Integer c2 = queue.poll();
            queue.offer(c2);
            queue.offer((c1 + c2) % 1234567);

        }
        return queue.pollLast();

    }


    public static void main(String[] args) {
        int n = 3;
        int n2 = 5;

        System.out.println("solution(n) = " + solution(n));
        System.out.println("solution(n) = " + solution(n2));

    }
}
