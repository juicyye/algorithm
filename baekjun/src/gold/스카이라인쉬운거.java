package gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.Deque;

public class 스카이라인쉬운거 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = 0;
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            int y = Integer.parseInt(split[1]);

            while (!stack.isEmpty() && stack.peek() > y) {
                stack.pop();
            }

            if (stack.isEmpty() || stack.peek() < y) {
                stack.push(y);
                if(y > 0) count++;
            }
        }
        bw.write(count + "\n");
        bw.close();
        br.close();
    }
}
