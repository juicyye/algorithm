package silver.week3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 숫자판점프 {
    private static int[][] board;
    private static Set<String> set = new HashSet<>();
    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, -1, 0, 1};
    private static int[] check = new int[6];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        board = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                dfs(i, j, 0);
            }
        }

        System.out.println(set.size());
    }

    public static void dfs(int x, int y, int depth) {
        if(depth == 6) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 6; i++) {
                sb.append(check[i]);
            }
            set.add(sb.toString());
            return;
        }

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if(nx >= 0 && nx < 5 && ny >= 0 && ny < 5) {
                check[depth] = board[nx][ny];
                dfs(nx,ny,depth+1);
            }
        }

    }
}
