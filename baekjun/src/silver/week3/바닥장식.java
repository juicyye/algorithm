package silver.week3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class 바닥장식 {
    private static int n, m, answer = 0;
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
                if (inputs[j].equals("-")) {
                    board[i][j] = 1;
                    continue;
                }
                board[i][j] = 2;
            }
        }
        solution();
        System.out.println(answer);
    }

    private static void solution(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (board[i][j] == 1) {
                    dfsRow(i,j);
                    answer++;
                } else if(board[i][j] == 2) {
                    dfsColumn(i,j);
                    answer++;
                }
            }
        }
    }

    private static void checkRow(int i, int j) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{i, j});
        board[i][j] = 0;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int ny = y + 1;
            if(ny >= 0 && ny < m && board[x][ny] == 1){
                queue.add(new int[]{x, ny});
                board[x][ny] = 0;
            }
        }
    }

    private static void checkColumn(int i, int j) {
        Queue<int[]> queue = new ArrayDeque<>();
        queue.add(new int[]{i, j});
        board[i][j] = 0;

        while(!queue.isEmpty()){
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int nx = x + 1;
            if(nx >= 0 && nx < n && board[nx][y] == 2){
                queue.add(new int[]{nx, y});
                board[nx][y] = 0;
            }
        }
    }

    private static void dfsRow(int x, int y) {
        if(y < 0 || y >= m || board[x][y] != 1){
            return;
        }
        board[x][y] = 0;
        dfsRow(x, y+1);
    }

    private static void dfsColumn(int x, int y) {
        if (x < 0 || x >= n || board[x][y] != 2) {
            return;
        }
        board[x][y] = 0;
        dfsColumn(x+1, y);
    }
}
