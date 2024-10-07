package chap_08;

import java.util.Scanner;

public class 중복순열_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] pm = new int[m];

        dfs(0, n, m, pm);

    }

    public static void dfs(int l, int n, int m, int[] pm) {
        if (l == m) {
            for (int i : pm) {
                System.out.print(i + " ");
            }
            System.out.println();

        } else{
            for (int i = 1; i <= n; i++) {
                pm[l] = i;
                dfs(l + 1, n, m, pm);
            }

        }
    }
}
