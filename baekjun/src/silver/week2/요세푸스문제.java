package silver.week2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 요세푸스문제 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);

        Queue<Integer> queue = new LinkedList<>();
        List<String> answer = new LinkedList<>();

        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }
        while (!queue.isEmpty()) {
            for (int i = 0; i < k - 1; i++) {
                queue.offer(queue.poll());
            }
            answer.add(String.valueOf(queue.poll()));
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        sb.append(String.join(", ", answer));
        sb.append(">");

        System.out.println(sb);
    }
}
