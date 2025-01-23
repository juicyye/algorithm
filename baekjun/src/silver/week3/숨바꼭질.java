package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class 숨바꼭질 {
    private static int MAX = 100_000;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer[] arr = Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);
        Integer subin = arr[0];
        Integer brother = arr[1];

        System.out.println(bfs(subin, brother));
    }

    private static int bfs(int source, int target) {
        boolean[] visited = new boolean[MAX + 1];
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{source, 0});
        visited[source] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int current = cur[0];
            int distance = cur[1];

            if (current == target) {
                return distance;
            }

            int[] nextPositions = {current - 1, current + 1, current * 2};

            for (int next : nextPositions) {
                if (next >= 0 && next <= MAX && !visited[next]) {
                    visited[next] = true;
                    queue.add(new int[]{next, distance + 1});
                }
            }
        }
        return -1;
    }
}
