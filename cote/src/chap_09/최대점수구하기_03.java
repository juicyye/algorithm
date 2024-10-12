package chap_09;

import java.util.Scanner;

public class 최대점수구하기_03 {
    private static boolean flag = false;
    private static int answer = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }

        dfs(0, 0, 0, a, b, n, m);


    }

    public static void dfs(int l,int sum, int time,int[] ps, int[] pt, int n,int m) {
        if(time > m) return;
        if (l == n) {
            answer = Math.max(answer,sum);

        } else{
            dfs(l + 1, sum + ps[l], time + pt[l], ps, pt, n,m);
            dfs(l + 1, sum, time, ps, pt, n,m);
        }

    }
}
