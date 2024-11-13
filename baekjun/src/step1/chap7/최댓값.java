package step1.chap7;

import java.util.Arrays;
import java.util.Scanner;

public class 최댓값 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] grid = new int[9][9];
        int max = Integer.MIN_VALUE;
        int maxRow = 0;
        int maxCol = 0;

        // 9x9 격자판 값 입력 및 최댓값과 위치 찾기
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                grid[i][j] = sc.nextInt();

                // 최댓값 갱신 및 위치 저장
                if (grid[i][j] > max) {
                    max = grid[i][j];
                    maxRow = i + 1; // 행 번호 (1부터 시작)
                    maxCol = j + 1; // 열 번호 (1부터 시작)
                }
            }
        }

        // 결과 출력
        System.out.println(max);
        System.out.println(maxRow + " " + maxCol);

        sc.close();
    }
}
