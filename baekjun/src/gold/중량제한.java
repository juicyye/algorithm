package gold;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 중량제한 {
    private static int n,m;
    private static List<List<Edge>> graph = new ArrayList<>();
    private static int start, end;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int weight = sc.nextInt();
            graph.get(a).add(new Edge(b, weight));
            graph.get(b).add(new Edge(a, weight));
        }

        start = sc.nextInt();
        end = sc.nextInt();

        System.out.println(binarySearch());
    }

    private static int binarySearch() {
        int lt = 1;
        int rt = 1_000_000_000;
        int answer = 0;

        while (lt <= rt) {
            int mid = (lt + rt) / 2;

            if (solution(mid)) {
                answer = mid;
                lt = mid + 1;
            } else{
                rt = mid - 1;
            }
        }
        return answer;
    }

    private static boolean solution(int weight) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            Integer current = queue.poll();

            if (current == end) {
                return true;
            }

            for (Edge edge : graph.get(current)) {
                if (!visited[edge.vex] && edge.weight >= weight) {
                    queue.add(edge.vex);
                    visited[edge.vex] = true;
                }
            }
        }
        return false;

    }

    static class Edge {
        int vex;
        int weight;

        public Edge(int vex, int weight) {
            this.vex = vex;
            this.weight = weight;
        }
    }
}
