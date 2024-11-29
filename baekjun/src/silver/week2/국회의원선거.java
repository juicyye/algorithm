package silver.week2;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class 국회의원선거 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int dasom = sc.nextInt();

        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 1; i < n; i++) {
            queue.add(sc.nextInt());
        }

        int answer = 0;
        while(!queue.isEmpty()) {
            if (queue.peek() >= dasom) {
                queue.add(queue.poll()-1);
                dasom++;
                answer++;
            } else{
                break;
            }

        }

        System.out.println(answer);


    }
}
