package silver.week3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 유기농배추 {
    private static int m, n, k;
    private static int[][] board;
    private static int[][] move = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            m = sc.nextInt();
            n = sc.nextInt();
            k = sc.nextInt();
            board = new int[m][n];
            for (int i = 0; i < k; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                board[x][y] = 1;
            }
            System.out.println(solution());
        }
    }

    private static int solution() {
        int answer = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) {
                    answer++;
                    bfs(i,j);
                }
            }
        }
        return answer;
    }

    private static void bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        board[x][y] = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int dx = current[0];
            int dy = current[1];

            for (int[] ints : move) {
                int nx = dx + ints[1];
                int ny = dy + ints[0];

                if(nx >= 0 && nx < m && ny >= 0 && ny < n && board[nx][ny] == 1) {
                    queue.offer(new int[]{nx, ny});
                    board[nx][ny] = 0;
                }
            }
        }
    }
}
