package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.PriorityQueue;
import java.util.Queue;

public class 파일합치기3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            Queue<Long> queue = new PriorityQueue<>();
            int k = Integer.parseInt(br.readLine());
            String[] numbers = br.readLine().split(" ");
            for (int i = 0; i < k; i++) {
                queue.add(Long.parseLong(numbers[i]));
            }
            long sum = solution(queue);
            bw.write(sum + "\n");
        }
        bw.close();
        br.close();
    }

    private static long solution(Queue<Long> queue) {
        long totalCost = 0;
        while (queue.size() > 1) {
            long first = queue.poll();
            long second = queue.poll();
            long mergeCost = first + second;
            totalCost += mergeCost;
            queue.offer(mergeCost);
        }
        return totalCost;
    }
}
