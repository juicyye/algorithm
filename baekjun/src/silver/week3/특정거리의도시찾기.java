package silver.week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 특정거리의도시찾기 {
    private static List<List<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
        }

        Queue<Integer> answer = bfs(n, k, x);

        if (answer == null) {
            System.out.println(-1);
        } else {
            answer.stream().sorted().forEach(System.out::println);
        }

    }

    private static Queue<Integer> bfs(int n, int target, int start) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            if (level == target) return queue;
                else if(level > target) return null;
            while (size-- > 0) {
                int cur = queue.poll();
                for (Integer i : graph.get(cur)) {
                    if (!visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
            level++;
        }
        return null;
    }
}
