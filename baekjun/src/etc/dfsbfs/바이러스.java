package etc.dfsbfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class 바이러스 {
    private static int count = 0;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        List<List<Integer>> graph = new ArrayList<List<Integer>>();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        boolean[] visited = new boolean[n+1];

        dfs(1, graph, visited);
        System.out.println(count - 1);
    }

    public static void dfs(int start, List<List<Integer>> graph, boolean[] visited) {
        visited[start] = true;
        count++;

        for (Integer next : graph.get(start)) {
            if(!visited[next]) {
                dfs(next, graph, visited);
            }
        }

    }
}
