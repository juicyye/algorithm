package silver.week3;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class 점프왕쩰리 {
    private static int[][] board;
    private static boolean[][] visited;
    private static int n;
    private static String answer = "Hing";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        board = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        dfs(0, 0);
        System.out.println(answer);
    }

    private static void bfs() {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{0, 0});
        visited[0][0] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0];
            int y = cur[1];

            if (board[x][y] == -1) {
                answer = "HaruHaru";
                return;
            }

            int jump = board[x][y];

            if (x + jump > 0 && x + jump < n && !visited[x + jump][y]) {
                queue.add(new int[]{x + jump, y});
                visited[x + jump][y] = true;
            }

            if (y + jump > 0 && y + jump < n && !visited[x][y + jump]) {
                queue.add(new int[]{x, y + jump});
                visited[x][y + jump] = true;
            }
        }
    }

    public static void dfs(int x, int y) {
        if (board[x][y] == -1) {
            answer = "HaruHaru";
            return;
        }

        visited[x][y] = true;
        int jump = board[x][y];

        if (x + jump > 0 && x + jump < n && !visited[x + jump][y]) {
            dfs(x + jump, y);
        }
        if (y + jump > 0 && y + jump < n && !visited[x][y + jump]) {
            dfs(x, y + jump);
        }

    }
}
