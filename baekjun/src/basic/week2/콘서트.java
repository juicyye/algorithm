package basic.week2;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 콘서트 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Queue<Integer> queue = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int answer = 1;
        while (!queue.isEmpty()) {
            Integer current = queue.poll();
            if(current != answer) break;
            answer++;
        }

        System.out.println(answer);
    }
}
