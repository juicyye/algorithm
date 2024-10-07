package cote;

import java.util.Scanner;

public class 연습용 {

    static int countMentors(int n, int m, int[][] ranks) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            boolean is = true;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < m; k++) {
                    if (ranks[i][k] <= ranks[j][k]) {
                        is = false;
                        break;
                    }
                }
            }
            if(is){

            }
        }
        return 0;
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


