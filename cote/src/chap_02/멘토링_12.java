package chap_02;

import java.util.Scanner;

public class 멘토링_12 {
    static int countMentors(int n, int m, int[][] arr) {
        int answer = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                int cnt = 0;
                for (int k = 0; k < m; k++) {
                    int pi = 0, pj = 0;
                    // arr[k][s] k번 테스트에서 s등인 학생의 번호
                    for (int s = 0; s < n; s++) {
                        if(arr[k][s]==i) pi=s; // arr[0][2] == 1 -> 0번째 시험에서 2등인 학생번호는 1번
                        if(arr[k][s]==j) pj=s;
                    }
                    if(pi<pj) cnt++;

                }
                if(cnt==m) answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 학생 수와 문제 수 입력
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // 등수 배열 입력
        int[][] ranks = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                ranks[i][j] = scanner.nextInt();
            }
        }

        // 멘토의 수 계산 후 출력
        int mentorCount = countMentors(n, m, ranks);
        System.out.println("The number of mentors: " + mentorCount);
    }
}
