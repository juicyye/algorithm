package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class BucketBrigade {
    private static char[][] board = new char[10][10];
    private static int[][] direction = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] lake = new int[2];
        int[] barn = new int[2];

        for (int i = 0; i < 10; i++) {
            String input = br.readLine();
            for (int j = 0; j < 10; j++) {
                board[i][j] = input.charAt(j);
                if(board[i][j] == 'B') barn = new int[]{i,j};
                if(board[i][j] == 'L') lake = new int[]{i,j};
            }
        }

        System.out.println(bfs(lake, barn));

    }

    private static int bfs(int[] lake, int[] barn) {
        boolean[][] visited = new boolean[10][10];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{lake[0], lake[1], 0});
        visited[lake[0]][lake[1]] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            if(barn[0] == x && barn[1] == y) return distance - 1;

            for (int[] ints : direction) {
                int nx = x + ints[0];
                int ny = y + ints[1];

                if(nx >= 0 && nx < 10 && ny >= 0 && ny < 10 && !visited[nx][ny] && board[nx][ny] != 'R') {
                    visited[nx][ny] = true;
                    queue.offer(new int[]{nx, ny, distance + 1});
                }
            }
        }
        return -1;
    }
}
