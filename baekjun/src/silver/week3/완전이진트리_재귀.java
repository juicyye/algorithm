package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class 완전이진트리_재귀 {
    private static List<List<Integer>> list = new ArrayList<>();
    private static int[] arr;
    private static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        k = Integer.parseInt(br.readLine());
        int len = (int) Math.pow(2, k) - 1;
        arr = new int[len];
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < k; i++) {
            list.add(new ArrayList<>());
        }
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }
        recursion(0, len - 1, 0);

        for (int i = 0; i < k; i++) {
            for (Integer integer : list.get(i)) {
                sb.append(integer).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }

    public static void recursion(int start, int end, int depth) {
        if (depth == k) {
            return;
        }
        int mid = (start + end) / 2;
        list.get(depth).add(arr[mid]);

        recursion(start, mid - 1, depth + 1);
        recursion(mid + 1, end, depth + 1);

    }
}
