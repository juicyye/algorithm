package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class 양치기꿍 {
    private static char[][] board;
    private static boolean[][] visited;
    private static int r,c;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        r = Integer.parseInt(split[0]);
        c = Integer.parseInt(split[1]);

        board = new char[r][c];
        visited = new boolean[r][c];
        for (int i = 0; i < r; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int wolf = 0, sheep =0;

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (!visited[i][j] && (board[i][j] == 'v' || board[i][j] == 'k')) {
                    int[] arr = bfs(i, j);
                    if (arr[1] > arr[0]) {
                        sheep += arr[1];
                    } else{
                        wolf += arr[0];
                    }
                }
            }
        }
        System.out.println(sheep + " " + wolf);
    }

    private static int[] bfs(int startY, int startX) {
        visited[startY][startX] = true;
        int v = 0;
        int k = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{startY, startX});

        while(!queue.isEmpty()) {
            int[] cur = queue.poll();
            int y = cur[0];
            int x = cur[1];

            if(board[y][x] == 'v') {
                v++;
            } else if (board[y][x] == 'k') {
                k++;
            }

            for (int i = 0; i < 4; i++) {
                int ny = y + dy[i];
                int nx = x + dx[i];

                if(ny >= 0 && ny < r && nx >= 0 && nx < c && !visited[ny][nx] && board[ny][nx] != '#') {
                    visited[ny][nx] = true;
                    queue.offer(new int[]{ny, nx});
                }
            }
        }
        return new int[]{v, k};
    }
}
