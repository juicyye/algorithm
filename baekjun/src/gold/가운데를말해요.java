package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class 가운데를말해요 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        // 최대 힙 (중앙값 이하)
        PriorityQueue<Integer> leftHeap = new PriorityQueue<>(Collections.reverseOrder());
        // 최소 힙 (중앙값 이상)
        PriorityQueue<Integer> rightHeap = new PriorityQueue<>();

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());

            // 왼쪽 힙과 오른쪽 힙을 적절히 나누어 삽입
            if (leftHeap.isEmpty() || k <= leftHeap.peek()) {
                leftHeap.offer(k);
            } else {
                rightHeap.offer(k);
            }

            // 힙 크기 조정: 왼쪽 힙이 항상 오른쪽 힙보다 같거나 많아야 함
            if (leftHeap.size() > rightHeap.size() + 1) {
                rightHeap.offer(leftHeap.poll());
            } else if (rightHeap.size() > leftHeap.size()) {
                leftHeap.offer(rightHeap.poll());
            }

            // 현재 중앙값 출력
            bw.write(leftHeap.peek() + "\n");
        }

        br.close();
        bw.close();
    }
}
