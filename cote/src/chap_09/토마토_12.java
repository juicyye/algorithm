package chap_09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 토마토_12 {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int[][] dis;
    private static int m;
    private static int n;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        n = sc.nextInt();

        Queue<int[]> queue = new LinkedList<>();

        int[][] board = new int[n][m];
        dis = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                board[i][j] = sc.nextInt();
                if(board[i][j] == 1) {
                    queue.add(new int[]{i, j});
                }
            }
        }

        dfs(board, queue);

        boolean flag = true;
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 0) flag = false;
            }
        }

        if (flag) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    answer = Math.max(answer, dis[i][j]);
                }
            }
            System.out.println(answer);
        } else System.out.println(-1);
    }

    public static void dfs(int[][] board, Queue<int[]> queue) {
        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0]+ dx[i];
                int ny = cur[1]+ dy[i];

                if(nx>0 && nx<n && ny>0 && ny<m && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    dis[nx][ny] = dis[cur[0]][cur[1]] + 1;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}
