package etc.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 스타트링크 {
    private static boolean[] visited;
    private static int height;
    private static int[] move;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        height = sc.nextInt();
        visited = new boolean[height + 1];
        int start = sc.nextInt();
        int target = sc.nextInt();
        move = new int[]{sc.nextInt(), -sc.nextInt()};

        int answer = bfs(start, target);
        System.out.println(answer == -1 ? "use the stairs" : answer);
    }

    private static int bfs(int start, int target) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{start, 0});
        visited[start] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int ch = current[0];
            int distance = current[1];

            if (ch == target) {
                return distance;
            }

            for (int i : move) {
                int next = ch + i;
                if (next > 0 && next <= height && !visited[next]) {
                    queue.add(new int[]{next, distance + 1});
                    visited[next] = true;
                }
            }
        }
        return -1;
    }
}
