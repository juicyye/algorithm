package chap_07;

import java.util.*;

public class 그래프최단거리_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // 노드 개수
        int m = sc.nextInt(); // 간선 개수

        // 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 방문 체크 및 거리 배열 초기화
        int[] ch = new int[n + 1]; // 방문 체크 배열
        int[] dis = new int[n + 1]; // 거리 배열

        // 간선 입력
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        // BFS 수행
        bfs(1, ch, dis, graph, n);

        // 각 노드까지의 최단 거리 출력
        for (int i = 2; i <= n; i++) { // 1번 노드는 시작점이므로 제외하고 출력
            System.out.println(i + "번 노드까지의 최단 거리: " + dis[i]);
        }
    }

    public static void bfs(int start, int[] ch, int[] dis, List<List<Integer>> graph, int n) {
        Queue<Integer> queue = new LinkedList<>();
        ch[start] = 1; // 시작점 방문 체크
        dis[start] = 0; // 시작점까지의 거리는 0
        queue.offer(start);

        // BFS 탐색
        while (!queue.isEmpty()) {
            int cur = queue.poll(); // 현재 노드
            for (int nv : graph.get(cur)) { // 현재 노드와 연결된 다음 노드 탐색
                if (ch[nv] == 0) { // 방문하지 않은 노드일 때
                    ch[nv] = 1; // 방문 체크
                    queue.offer(nv); // 큐에 추가
                    dis[nv] = dis[cur] + 1; // 현재 노드에서 다음 노드까지의 거리 계산
                }
            }
        }
    }
}
