package gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class 탑 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] towerStrings = br.readLine().split(" ");

        int[] towers = new int[n];
        for (int i = 0; i < n; i++) {
            towers[i] = Integer.parseInt(towerStrings[i]);
        }

        int[] result = new int[n];
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            int currentHeight = towers[i];

            while (!stack.isEmpty() && towers[stack.peek()] < currentHeight) {
                stack.pop();
            }

            if (!stack.isEmpty()) {
                result[i] = stack.peek() + 1;
            } else {
                result[i] = 0;
            }

            stack.push(i);
        }

        StringBuilder sb = new StringBuilder();
        for (int res : result) {
            sb.append(res).append(" ");
        }

        // 출력
        System.out.println(sb);
    }
}
