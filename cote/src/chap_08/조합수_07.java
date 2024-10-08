package chap_08;

import java.util.Scanner;

public class 조합수_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        int[][] dy = new int[35][35];

        System.out.println(dfs(n, r,dy));

    }

    public static int dfs(int n, int r,int[][] dy) {
        if(dy[n][r] > 0) return dy[n][r];
        if(n==r || r == 0) return 1;
        else return dy[n][r] = dfs(n - 1, r - 1,dy) + dfs(n - 1, r,dy);
    }
}
