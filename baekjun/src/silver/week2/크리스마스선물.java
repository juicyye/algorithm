package silver.week2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 크리스마스선물 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            if (a == 0) {
                sb.append(queue.isEmpty() ? "-1" : queue.poll()).append("\n");
            } else{
                for (int j = 0; j < a; j++) {
                    queue.offer(sc.nextInt());
                }
            }
        }

        System.out.println(sb);
    }
}
