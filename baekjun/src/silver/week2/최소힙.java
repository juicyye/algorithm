package silver.week2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 최소힙 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x == 0) {
                sb.append(queue.isEmpty() ? "0" : queue.poll()).append("\n");
            } else{
                queue.add(x);
            }
        }
        System.out.println(sb);
    }
}
