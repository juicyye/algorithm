package silver.week2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class 보물 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> a = new PriorityQueue<>();
        Queue<Integer> b = new PriorityQueue<>(Collections.reverseOrder());

        int n = Integer.parseInt(br.readLine());

        Arrays.stream(br.readLine().split(" "))
                .forEach(i -> a.offer(Integer.parseInt(i)));

        Arrays.stream(br.readLine().split(" "))
                .forEach(i -> b.offer(Integer.parseInt(i)));

        int answer = 0;
        for (int i = 0; i < n; i++) {
            answer += a.poll() * b.poll();
        }

        System.out.println(answer);


    }
}
