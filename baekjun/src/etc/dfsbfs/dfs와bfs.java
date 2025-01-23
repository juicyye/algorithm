package etc.dfsbfs;

import java.util.*;

public class dfs와bfs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 정점의 개수
        int m = sc.nextInt();  // 간선의 개수
        int v = sc.nextInt();  // 시작 정점 번호

        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 입력받기
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        // 작은 번호부터 방문하기 위해 각 리스트를 정렬
        for (int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        // DFS 수행
        boolean[] visited = new boolean[n + 1];
        dfs(v, visited, graph);
        System.out.println();  // 줄바꿈

        // BFS 수행
        visited = new boolean[n + 1];  // 방문 기록 초기화
        bfs(v, visited, graph);
    }

    // DFS 구현 (재귀)
    public static void dfs(int start, boolean[] visited, List<List<Integer>> graph) {
        visited[start] = true;
        System.out.print(start + " ");

        for (int nv : graph.get(start)) {
            if (!visited[nv]) {
                dfs(nv, visited, graph);
            }
        }
    }

    // BFS 구현 (큐)
    public static void bfs(int start, boolean[] visited, List<List<Integer>> graph) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            System.out.print(node + " ");

            for (int nv : graph.get(node)) {
                if (!visited[nv]) {
                    visited[nv] = true;
                    queue.offer(nv);
                }
            }
        }
    }
}
