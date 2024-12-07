package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 완전이진트리 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        int len = (int) Math.pow(2, k) - 1;
        int[] arr = new int[len];

        String[] split = br.readLine().split(" ");
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int parent = len;
        while (parent != 0) {
            int child = (parent - 1) / 2;
            int gap = (parent - child) * 2;
            for (int i = child; i < len; i += gap) {
                sb.append(arr[i] + " ");
            }
            parent = child;
            sb.append("\n");
        }
        System.out.println(sb);
    }

}
