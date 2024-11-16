package silver.week1;

import java.util.Scanner;

public class 차원2배열의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n + 1][m + 1];
        int[][] prefixSum = new int[n + 1][m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                arr[i][j] = sc.nextInt();
                // 누적합 계산
                prefixSum[i][j] = arr[i][j] + prefixSum[i - 1][j] + prefixSum[i][j - 1] - prefixSum[i - 1][j - 1];
            }
        }

        int k = sc.nextInt();
        for (int a = 0; a < k; a++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            // 누적합으로 (i,j) ~ (x,y) 구하기
            int sum = prefixSum[x][y] - prefixSum[i - 1][y] - prefixSum[x][j - 1] + prefixSum[i - 1][j - 1];
            System.out.println(sum);

        }

        sc.close();
    }
}
