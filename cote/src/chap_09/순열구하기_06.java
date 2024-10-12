package chap_09;

import java.util.Arrays;
import java.util.Scanner;

public class 순열구하기_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] pm = new int[m];
        int[] ch = new int[n];
        dfs(0, n, m, arr, pm, ch);

    }

    public static void dfs(int l, int n,int m, int[] arr, int[] pm, int[] ch) {
        if (l == m) {
            System.out.println(Arrays.toString(pm));

        } else{
            for (int i = 0; i < n; i++) {
                if (ch[i] == 0) {
                    ch[i] = 1;
                    pm[l] = arr[i];
                    dfs(l + 1, n, m, arr,pm,ch);
                    ch[i] = 0;
                }

            }
        }
    }
}
