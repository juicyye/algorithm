package chap_07;

import java.util.Scanner;

public class 경로탐색_12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] graph = new int[n + 1][n + 1];
        int[] ch = new int[n + 1];

        // 그래프 정보 입력
        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph[a][b] = 1;
        }

        // 시작점 방문 처리
        ch[1] = 1;

        // DFS 시작
        System.out.println(dfs(1, n, graph, ch));
    }

    // DFS 함수
    public static int dfs(int start, int n, int[][] graph, int[] ch) {
        if (start == n) {
            return 1; // 도착점에 도달한 경우
        }

        int answer = 0;
        for (int i = 1; i <= n; i++) {
            if (graph[start][i] == 1 && ch[i] == 0) {
                ch[i] = 1;
                answer += dfs(i, n, graph, ch); // 경로 수를 더함
                ch[i] = 0; // 방문 기록 해제
            }
        }
        return answer;
    }
}
