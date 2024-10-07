package chap_08;

import java.util.Scanner;

public class 합이같은부분집합_01 {
    private static boolean flag = false;
    private static String answer = "NO";
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int total = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            total += arr[i];
        }
        dfs(0, 0, arr, n, total);
        System.out.println(answer);
    }

    public static void dfs(int l, int sum, int[] arr, int n, int total) {
        if (flag) return;
        if(sum > total/2) return;
        if (l == n) {
            if (total / 2 == sum) {
                answer = "YES";
                flag = true;
            }

        } else{
            dfs(l + 1, sum + arr[l], arr, n,total);
            dfs(l + 1, sum, arr, n,total);
        }
    }
}
