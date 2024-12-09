package silver.week3;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class 촌수계산 {
    private static List<List<Integer>> graph = new ArrayList<>();
    private static boolean[] checked;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int source = sc.nextInt();
        int m = sc.nextInt();
        checked = new boolean[n + 1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        System.out.println(bfs(source, target));

    }

    private static int bfs(int source, int target){
        Queue<Integer> queue = new ArrayDeque<>();
        queue.add(source);
        checked[source] = true;
        int answer = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                int cur = queue.poll();
                if(cur == target){
                    return answer;
                }
                for (Integer next : graph.get(cur)) {
                    if(!checked[next]) {
                        queue.add(next);
                        checked[next] = true;
                    }
                }
            }
            answer++;

        }
        return -1;
    }
}
