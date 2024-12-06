package silver.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class 전직5차 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);
        Queue<Long> queue = new PriorityQueue<>();

        String[] input = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            queue.offer(Long.parseLong(input[i]));
        }

        long count = 0;
        long sum = 0;

        while (!queue.isEmpty()) {
            sum += Math.min(count++, k) * queue.poll();
        }
        System.out.println(sum);


    }
}
