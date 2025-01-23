package etc.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class 안전영역 {
    private static int n;
    private static int[][] board;
    private static int[][] move = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        board = new int[n][n];

        int answer = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < n; j++) {
                board[i][j] = Integer.parseInt(split[j]);
                min = Math.min(board[i][j], min);
                max = Math.max(board[i][j], max);
            }
        }

        for (int i = min - 1; i <= max; i++) {
            int solution = solution(i);
            answer = Math.max(answer, solution);
        }

        System.out.println(answer);

    }

    private static int solution(int p) {
        visited = new boolean[n][n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] >= p && !visited[i][j]) {
                    bfs(i, j, p);
                    count++;
                }
            }
        }
        return count;
    }

    private static void bfs(int y, int x, int p) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int dy = cur[0];
            int dx = cur[1];

            for (int[] ints : move) {
                int ny = dy + ints[0];
                int nx = dx + ints[1];

                if (ny >= 0 && ny < n && nx >= 0 && nx < n && !visited[ny][nx] && board[ny][nx] >= p) {
                    visited[ny][nx] = true;
                    queue.add(new int[]{ny, nx});
                }
            }
        }

    }
}
