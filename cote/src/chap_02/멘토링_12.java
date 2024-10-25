package chap_02;

import java.util.Scanner;

public class 멘토링_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수와 문제 수 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 등수 배열 입력
        int[][] ranks = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ranks[i][j] = scanner.nextInt();
            }
        }

        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int count = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    for (int s = 0; s < n; s++) {
                        if(ranks[k][s] == i) pi =s;
                        if(ranks[k][s] == j) pj =s;
                    }
                    if(pi<pj) count++;
                }
                if(count == m) answer++;
            }
        }
        System.out.println(answer);


    }
}
