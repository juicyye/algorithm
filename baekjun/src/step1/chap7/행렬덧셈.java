package step1.chap7;

import java.util.Scanner;

public class 행렬덧셈 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 첫째 줄에 행렬의 크기 N과 M 입력받기
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        // 행렬 A와 B를 저장할 배열
        int[][] A = new int[N][M];
        int[][] B = new int[N][M];

        // 행렬 A 입력받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                A[i][j] = scanner.nextInt();
            }
        }

        // 행렬 B 입력받기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                B[i][j] = scanner.nextInt();
            }
        }

        // 행렬 A와 B를 더해서 출력하기
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                // A[i][j]와 B[i][j]의 합을 출력
                System.out.print(A[i][j] + B[i][j] + " ");
            }
            System.out.println(); // 각 행을 출력한 후 줄바꿈
        }

        scanner.close();
    }
}
