package chap_02;

import java.util.Scanner;

public class df {
    static int solution(int n, int m, int[][] arr) {
        int answer= 0;
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi=0, pj=0;
                    for (int s = 0; s < n; s++) {
                        if(arr[k][s]==i) pi =s;
                        if(arr[k][s]==j)pj=s;
                    }
                    if(pi<pj) cnt++;
                }
                if (cnt == m) {
                    answer++;
                }
            }
        }
        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr =new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        System.out.println("s = " + solution(n,m, arr));
    }
}
