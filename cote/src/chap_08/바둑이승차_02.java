package chap_08;

import java.util.Map;
import java.util.Scanner;

public class 바둑이승차_02 {
    private static int answer = 0;


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        dfs(0, 0, c, n, arr);
        System.out.println(answer);


    }

    public static void dfs(int l, int sum, int c, int n, int[] arr) {
        if(sum > c) return;
        if (l == n) {
            answer= Math.max(answer,sum);

        } else {
            dfs(l+1, sum + arr[l], c, n, arr);
            dfs(l+1, sum, c, n, arr);

        }
    }
}
