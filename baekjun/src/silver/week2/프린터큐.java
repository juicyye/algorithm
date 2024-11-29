package silver.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class 프린터큐 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int repeat = Integer.parseInt(br.readLine());

        for (int i = 0; i < repeat; i++) {
            String[] split = br.readLine().split(" ");
            Queue<int[]> queue = new LinkedList<>();

            int documentCount = Integer.parseInt(split[0]);
            int targetIndex = Integer.parseInt(split[1]);

            String[] numbers = br.readLine().split(" ");
            for (int j = 0; j < documentCount; j++) {
                queue.offer(new int[]{j, Integer.parseInt(numbers[j])});
            }

            int count = 0;
            while (!queue.isEmpty()) {
                int[] current = queue.poll();
                boolean hasHigherPriority = false;

                for (int[] ints : queue) {
                    if (current[1] < ints[1]) {
                        hasHigherPriority = true;
                        break;
                    }
                }

                if(hasHigherPriority) {
                    queue.offer(current);
                } else{
                    count++;
                    if (current[0] == targetIndex) {
                        bw.write(count + "\n");
                        break;
                    }
                }

            }
        }
        br.close();
        bw.close();
    }
}
