package silver.week3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 상근이의여행_dfs {
    private static Scanner sc = new Scanner(System.in);
    private static int n, m, answer = 0;
    private static boolean[] visited;
    private static List<List<Integer>> graph;

    public static void main(String[] args) {
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            graph = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                graph.add(new ArrayList<>());
            }

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                int b = sc.nextInt();
                graph.get(a).add(b);
                graph.get(b).add(a);
            }
            solution();

            System.out.println(answer);

        }
    }

    private static void solution(){
        visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (!visited[i]) {
                dfs(i);
            }
        }
    }

    private static void dfs(int node) {
        visited[node] = true;

        for (int next : graph.get(node)) {
            if(!visited[next]) {
                dfs(next);
                answer++;
            }
        }
    }
}
