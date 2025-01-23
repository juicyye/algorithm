package etc.dfsbfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 섬의개수 {
    private static int[][] move = {{-1, 0}, {-1, -1}, {0, -1}, {1, -1}, {1, 0}, {1, 1}, {0, 1}, {-1, 1}};
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int w, h;
        do {
            w = sc.nextInt();
            h = sc.nextInt();

            if (w == 0 && h == 0) break;

            int[][] board = new int[h][w]; // 행(h), 열(w) 순으로 배열 생성
            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    board[i][j] = sc.nextInt();
                }
            }

            int solution = solution(board, w, h);
            System.out.println(solution);

        } while (true);
    }

    private static int solution(int[][] board, int w, int h) {
        int answer = 0;
        boolean[][] visited = new boolean[h][w]; // 행(h), 열(w) 순으로 배열 초기화
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < w; j++) {
                if (board[i][j] == 1 && !visited[i][j]) {
                    bfs(visited, board, i, j, w, h);
                    answer++;
                }
            }
        }
        return answer;
    }

    private static void bfs(boolean[][] visited, int[][] board, int y, int x, int w, int h) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{y, x});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int dy = current[0];
            int dx = current[1];

            for (int[] ints : move) {
                int ny = dy + ints[0];
                int nx = dx + ints[1];

                if (ny >= 0 && ny < h && nx >= 0 && nx < w && board[ny][nx] == 1 && !visited[ny][nx]) {
                    queue.add(new int[]{ny, nx});
                    visited[ny][nx] = true;
                }
            }
        }
    }
}