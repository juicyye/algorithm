package etc.dfsbfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 단지번호붙이기 {
    private static int[][] move = {{-1, 0}, {0, -1}, {1, 0}, {0, 1}};
    private static char[][] board;
    private static int n;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());

        board = new char[n][n];
        for (int i = 0; i < n; i++) {
            board[i] = br.readLine().toCharArray();
        }

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == '1') {
                    int result = bfs(i, j);
                    answer.add(result);
                }
            }
        }

        System.out.println(answer.size());
        Collections.sort(answer);
        for (Integer i : answer) {
            System.out.println(i);
        }
    }

    private static int bfs(int a,int b){
        int answer = 1;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{a,b});
        board[a][b] = '0';

        while(!queue.isEmpty()){
            int[] cur = queue.poll();
            int y = cur[0];
            int x = cur[1];

            for (int[] ints : move) {
                int ny = y + ints[0];
                int nx = x + ints[1];

                if(nx >= 0 && nx < n && ny >= 0 && ny < n && board[ny][nx] == '1'){
                    board[ny][nx] = '0';
                    queue.add(new int[]{ny,nx});
                    answer++;
                }
            }
        }
        return answer;
    }
}
