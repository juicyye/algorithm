package chap_08;

import java.util.Scanner;

public class 수열추측하기_08 {
    public static boolean flag = false;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int f = sc.nextInt();

        int[] b= new int[n];
        int[] p = new int[n];

        int[] ch = new int[n + 1];
        int[][] dy = new int[35][35];

        for (int i = 0; i < n; i++) {
            b[i] = combi(n - 1, i, dy);
        }

        dfs(0, 0, ch, p, b, n,f);


    }

    public static void dfs(int l,int sum, int[] ch, int[] p,int[]b,int n, int f) {
        if(flag) return;
        if (l == n) {
            if (sum == f) {
                for (int i : p) {
                    System.out.print(i+" ");
                }
                flag = true;
            }

        } else{
            for (int i = 1; i <= n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    p[l] = i;
                    dfs(l + 1, sum + (p[l] * b[l]), ch, p, b, n,f);
                    ch[i] = 0;
                }
            }
        }

    }

    public static int combi(int n, int r, int[][] dy) {
        if(dy[n][r] >0) return dy[n][r];
        if(n == r || r == 0) return 1;
        else return dy[n][r] = combi(n - 1, r - 1, dy)+combi(n - 1, r, dy);

    }
}
