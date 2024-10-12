package chap_09;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class 미로의차단거리통로_11 {
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int answer = 0;
    private static int[][] dis = new int[8][8];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] board = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = sc.nextInt();
            }
        }
        bfs(0, 0, board);
        if(dis[7][7] == 0) System.out.println(-1);
        else System.out.println(dis[7][7]);
    }

    public static void bfs(int x, int y, int[][] board) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        board[x][y] = 1;

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nx = cur[0] + dx[i];
                int ny = cur[1] + dy[i];
                if (nx > 0 && nx < 8 && ny > 0 && ny < 8 && board[nx][ny] == 0) {
                    board[nx][ny] = 1;
                    queue.offer(new int[]{nx, ny});
                    dis[nx][ny] = dis[cur[0]][cur[1]] + 1;
                }
            }
        }
    }
}
