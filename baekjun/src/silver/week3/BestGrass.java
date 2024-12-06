package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class BestGrass {
    private static int n, m, answer = 0;
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        n = Integer.parseInt(split[0]);
        m = Integer.parseInt(split[1]);

        board = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] inputs = br.readLine().split("");
            for (int j = 0; j < m; j++) {
                if (inputs[j].equals("#")) {
                    board[i][j] = 1;
                }
            }
        }

        solution();
        System.out.println(answer);

    }

    private static void solution(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(board[i][j] == 1){
                    answer++;
                    bfs(i, j);
                }
            }
        }
    }

    private static void bfs(int i, int j) {
        Queue<int[]> queue = new ArrayDeque<>();
        board[i][j] = 0;
        queue.add(new int[]{i, j});

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];

            for (int k = 0; k < 4; k++) {
                int nx = x + dx[k];
                int ny = y + dy[k];

                if (nx >= 0 && nx < n && ny >= 0 && ny < m && board[nx][ny] == 1){
                    queue.add(new int[]{nx, ny});
                    board[nx][ny] = 0;
                }
            }
        }


    }
}
