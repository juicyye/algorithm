package chap_09;

import java.util.Scanner;

public class 조합구하기 {
    private static int[] combi;
    private static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        combi= new int[m];
        dfs(0, 1);
    }

    public static void dfs(int l, int s) {
        if (l == m) {
            for (int x : combi) {
                System.out.print(x + " ");
            }
            System.out.println();


        } else{
            for (int i = s; i <= n; i++) {
                combi[l] = i;
                dfs(l + 1, i+1);

            }
        }
    }
}
