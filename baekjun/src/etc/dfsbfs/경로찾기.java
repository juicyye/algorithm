package etc.dfsbfs;

import java.util.Scanner;

public class 경로찾기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 입력: 정점의 개수 N
        int N = sc.nextInt();
        int[][] graph = new int[N][N];

        // 그래프의 인접 행렬 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        // 플로이드-워셜 알고리즘
        for (int k = 0; k < N; k++) { // 중간 정점 k
            for (int i = 0; i < N; i++) { // 출발 정점 i
                for (int j = 0; j < N; j++) { // 도착 정점 j
                    if (graph[i][k] == 1 && graph[k][j] == 1) {
                        graph[i][j] = 1; // 경로 존재 갱신
                    }
                }
            }
        }

        // 결과 출력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
