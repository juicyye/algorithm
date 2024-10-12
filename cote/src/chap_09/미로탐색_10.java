package chap_09;

import java.util.Scanner;

public class 미로탐색_10 {

    private static int[] dx = {-1, 0, 1, 0};
    private static int[] dy = {0, 1, 0, -1};
    private static int answer = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] board = new int[8][8];
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        board[1][1] = 1;
        dfs(1, 1, board);
        System.out.println(answer);
    }

    public static void dfs(int x, int y, int[][] board) {
        if(x==7 && y ==7) answer++;
        else{
            for (int i = 0; i < 4; i++) {
                int nx = x+dx[i];
                int ny = y+dy[i];
                if(nx>=1 && nx<=7 && ny >=1 && ny <=7 && board[nx][ny]==0){
                    board[nx][ny] = 1;
                    dfs(nx, ny, board);
                    board[nx][ny] = 0;
                }
            }
        }
    }
}
